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

import com.example.scabdi.entity.BancoModulo;
import com.example.scabdi.service.BancoModuloService;

@RestController
@RequestMapping("/api/bancomodulo")
public class BancoModuloController {

	@Autowired
	private BancoModuloService service;

	// CREAR
	@PostMapping("/create")
	public ResponseEntity<BancoModulo> save(@RequestBody BancoModulo us) {
		try {
			BancoModulo ua = service.create(us);
			return new ResponseEntity<>(ua, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
		@GetMapping("/all")
		public ResponseEntity<List<BancoModulo>> list() {
			try {
				List<BancoModulo> list = new ArrayList<>();
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
		public ResponseEntity<BancoModulo> search(@PathVariable("id") int id) {
			BancoModulo us = service.read(id);
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
		public ResponseEntity<BancoModulo> update(@RequestBody BancoModulo u, @PathVariable("id") int id) {
			try {
				BancoModulo us = service.read(id);
				if (us.getId() > 0) {
					us.setId_banco(u.getId_banco());
					us.setId_modulo(u.getId_modulo());

					return new ResponseEntity<>(service.create(us), HttpStatus.OK);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}

			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
