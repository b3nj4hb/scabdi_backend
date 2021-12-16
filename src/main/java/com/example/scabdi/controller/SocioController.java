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

import com.example.scabdi.entity.Socio;
import com.example.scabdi.service.SocioService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/socio")
public class SocioController {

	@Autowired
	private SocioService service;

	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Socio> save(@RequestBody Socio us) {
		try {
			Socio ua = service.create(us);
			return new ResponseEntity<>(ua, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
		@GetMapping("/all")
		public ResponseEntity<List<Socio>> list() {
			try {
				List<Socio> list = new ArrayList<>();
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
		public ResponseEntity<Socio> search(@PathVariable("id") int id) {
			Socio us = service.read(id);
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
		public ResponseEntity<Socio> update(@RequestBody Socio u, @PathVariable("id") int id) {
			try {
				Socio us = service.read(id);
				if (us.getId() > 0) {
					us.setId_persona(u.getId_persona());
					us.setId_banco(u.getId_banco());

					return new ResponseEntity<>(service.create(us), HttpStatus.OK);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}

			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		// SOCIO
		@GetMapping("/socio")
		public ResponseEntity<List<Map<String,Object>>> socio() {
			try {
				List<Map<String,Object>> list = new ArrayList<>();
				list = service.socio();
				if (list.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(list, HttpStatus.OK);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		// DATOS {ID}
		@GetMapping("/datos/{id}")
		public ResponseEntity<List<Map<String, Object>>> datos(@PathVariable("id") int id) {
			List<Map<String, Object>> us = service.datos(id);
			if (us.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(us, HttpStatus.OK);
			}
		}
		
		// MODULOS {ID}
		@GetMapping("/modulos/{id}")
		public ResponseEntity<List<Map<String, Object>>> modulos(@PathVariable("id") int id) {
			List<Map<String, Object>> us = service.modulos(id);
			if (us.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(us, HttpStatus.OK);
			}
		}
		
		// PEDIDOS {ID}
		@GetMapping("/pedidos/{id}")
		public ResponseEntity<List<Map<String, Object>>> pedidos(@PathVariable("id") int id) {
			List<Map<String, Object>> us = service.pedidos(id);
			if (us.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(us, HttpStatus.OK);
			}
		}
}
