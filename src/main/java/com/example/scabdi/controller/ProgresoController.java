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

import com.example.scabdi.entity.Progreso;
import com.example.scabdi.service.ProgresoService;

@RestController
@RequestMapping("/api/progreso")
public class ProgresoController {

	@Autowired
	private ProgresoService service;

	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Progreso> save(@RequestBody Progreso us) {
		try {
			Progreso ua = service.create(us);
			return new ResponseEntity<>(ua, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
		@GetMapping("/all")
		public ResponseEntity<List<Progreso>> list() {
			try {
				List<Progreso> list = new ArrayList<>();
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
		public ResponseEntity<Progreso> search(@PathVariable("id") int id) {
			Progreso us = service.read(id);
			if (us.getId() > 0) {
				return new ResponseEntity<>(us, HttpStatus.OK);
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
		public ResponseEntity<Progreso> update(@RequestBody Progreso u, @PathVariable("id") int id) {
			try {
				Progreso us = service.read(id);
				if (us.getId() > 0) {
					us.setId_inscrito(u.getId_inscrito());
					us.setId_recurso(u.getId_recurso());
					us.setEs_progreso(u.getEs_progreso());

					return new ResponseEntity<>(service.create(us), HttpStatus.OK);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}

			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
