package com.example.scabdi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scabdi.entity.Recurso;
import com.example.scabdi.service.RecursoService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/recurso")
public class RecursoController {

	@Autowired
	private RecursoService recursoService;

	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Recurso> save(@RequestBody Recurso r) {
		try {
			Recurso re = recursoService.create(r);
			return new ResponseEntity<>(re, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
		@GetMapping("/all")
		public ResponseEntity<List<Recurso>> list() {
			try {
				List<Recurso> list = new ArrayList<>();
				list = recursoService.readAll();
				if (list.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(list, HttpStatus.OK);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		// BUSCAR {ID}
		@GetMapping("/read/{id}")
		public ResponseEntity<Recurso> search(@PathVariable("id") int id) {
			Recurso recurso = recursoService.read(id);
			if (recurso.getId() > 0) {
				return new ResponseEntity<>(recurso, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}

		// ELIMINAR
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id) {
			try {
				recursoService.delete(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		// ACTUALIZAR {ID}
		@PutMapping("/update/{id}")
		public ResponseEntity<Recurso> update(@RequestBody Recurso r, @PathVariable("id") int id) {
			try {
				Recurso re = recursoService.read(id);
				if (re.getId() > 0) {
					re.setId_sesion(r.getId_sesion());
					re.setId_tipo(r.getId_tipo());
					re.setNombre(r.getNombre());
					re.setFile(r.getFile());
					re.setUrl(r.getUrl());

					return new ResponseEntity<>(recursoService.create(re), HttpStatus.OK);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}

			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
