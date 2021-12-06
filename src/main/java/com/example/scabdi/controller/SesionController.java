package com.example.scabdi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

import com.example.scabdi.entity.Sesion;
import com.example.scabdi.service.SesionService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/sesion")
public class SesionController {

	@Autowired
	private SesionService service;

	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Sesion> save(@RequestBody Sesion us) {
		try {
			Sesion ua = service.create(us);
			return new ResponseEntity<>(ua, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
		@GetMapping("/all")
		public ResponseEntity<List<Sesion>> list() {
			try {
				List<Sesion> list = new ArrayList<>();
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
		public ResponseEntity<Sesion> search(@PathVariable("id") int id) {
			Sesion us = service.read(id);
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
		public ResponseEntity<Sesion> update(@RequestBody Sesion u, @PathVariable("id") int id) {
			try {
				Sesion us = service.read(id);
				if (us.getId() > 0) {
					us.setNo_sesion(u.getNo_sesion());
					us.setId_modulo(u.getId_modulo());
					us.setFe_inicio_sesion(u.getFe_inicio_sesion());
					us.setFe_fin_sesion(u.getFe_fin_sesion());

					return new ResponseEntity<>(service.create(us), HttpStatus.OK);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}

			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@GetMapping("/recursos/{id}")
		public ResponseEntity<List<Map<String,Object>>> listarrecurso(@PathVariable("id")int id) {
			try {
				List<Map<String,Object>> list = service.listarrecurso(id);
				list = service.listarrecurso(id);
				if (list.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(list, HttpStatus.OK);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@GetMapping("/listarecursos/{id}")
		public ResponseEntity<List<Map<String,Object>>> listarecurso(@PathVariable("id")int id) {
			try {
				List<Map<String,Object>> list = service.listarecurso(id);
				list = service.listarecurso(id);
				if (list.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(list, HttpStatus.OK);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		// LISTAR
		@GetMapping("/listar")
		public ResponseEntity<List<Map<String, Object>>> listar() {
			try {
				List<Map<String,Object>> list = new ArrayList<>();
				list = service.listarsesion();
				if (list.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(list, HttpStatus.OK);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
