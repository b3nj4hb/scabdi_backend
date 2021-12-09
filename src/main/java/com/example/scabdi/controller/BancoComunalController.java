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

import com.example.scabdi.entity.BancoComunal;
import com.example.scabdi.service.BancoComunalService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/bancocomunal")
public class BancoComunalController {

	@Autowired
	private BancoComunalService service;

	// CREAR
	@PostMapping("/create")
	public ResponseEntity<BancoComunal> save(@RequestBody BancoComunal us) {
		try {
			BancoComunal ua = service.create(us);
			return new ResponseEntity<>(ua, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
		@GetMapping("/all")
		public ResponseEntity<List<BancoComunal>> list() {
			try {
				List<BancoComunal> list = new ArrayList<>();
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
		public ResponseEntity<BancoComunal> search(@PathVariable("id") int id) {
			BancoComunal us = service.read(id);
			if (us.getId_bancocomunal() > 0) {
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
		public ResponseEntity<BancoComunal> update(@RequestBody BancoComunal u, @PathVariable("id") int id) {
			try {
				BancoComunal us = service.read(id);
				if (us.getId_bancocomunal() > 0) {
					us.setId_sede(u.getId_sede());
					us.setNo_bancocomunal(u.getNo_bancocomunal());
					us.setEs_bancocomunal(u.getEs_bancocomunal());

					return new ResponseEntity<>(service.create(us), HttpStatus.OK);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}

			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
