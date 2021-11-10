package com.example.scabdi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scabdi.entity.TipoRecurso;
import com.example.scabdi.service.TipoRecursoService;


@RestController
@RequestMapping("/api/tiporecurso")
public class TipoRecursoController {

	@Autowired
	private TipoRecursoService tipoRecursoService;
	@GetMapping("/all")
	public ResponseEntity<List<TipoRecurso>> getTipoRecurso(){
		try {
			List<TipoRecurso> list = new ArrayList<>();
			list = tipoRecursoService.readAll();
			if(list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
