package com.example.scabdi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scabdi.entity.Area;
import com.example.scabdi.service.AreaService;

@RestController
@RequestMapping("/api/area")
public class AreaController {

	@Autowired
	private AreaService service;

	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Area> save(@RequestBody Area us) {
		try {
			Area ua = service.create(us);
			return new ResponseEntity<>(ua, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
		@GetMapping("/all")
		public ResponseEntity<List<Area>> list() {
			try {
				List<Area> list = new ArrayList<>();
				list = service.readAll();
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
		public ResponseEntity<Area> search(@PathVariable("id") int id) {
			Area recurso = service.read(id);
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
				service.delete(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		// ACTUALIZAR {ID}
		@PutMapping("/update/{id}")
		public ResponseEntity<Area> update(@RequestBody Area u, @PathVariable("id") int id) {
			try {
				Area us = service.read(id);
				if (us.getId() > 0) {
					us.setNombre(u.getNombre());

					return new ResponseEntity<>(service.create(us), HttpStatus.OK);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}

			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
