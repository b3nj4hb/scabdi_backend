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

import com.example.scabdi.entity.Modulo;
import com.example.scabdi.service.ModuloService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/modulo")
public class ModuloController {

	@Autowired
	private ModuloService service;

	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Modulo> save(@RequestBody Modulo us) {
		try {
			Modulo ua = service.create(us);
			return new ResponseEntity<>(ua, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
	@GetMapping("/all")
	public ResponseEntity<List<Modulo>> list() {
		try {
			List<Modulo> list = new ArrayList<>();
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
	public ResponseEntity<Modulo> search(@PathVariable("id") int id) {
		Modulo us = service.read(id);
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
	public ResponseEntity<Modulo> update(@RequestBody Modulo u, @PathVariable("id") int id) {
		try {
			Modulo us = service.read(id);
			if (us.getId() > 0) {
				us.setArea(u.getArea());
				us.setNombre(u.getNombre());
				us.setDescripcion(u.getDescripcion());
				us.setRecursos(u.getRecursos());

				return new ResponseEntity<>(service.create(us), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
	@GetMapping("/modulosporbanco")
	public ResponseEntity<List<Map<String, Object>>> modulosporbanco() {
		try {
			List<Map<String, Object>> list = new ArrayList<>();
			list = service.modulosporbanco();
			if (list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// ACTUALIZAR {ID}
	@PutMapping("/updatemodulo/{id}")
	public ResponseEntity<String> actualizarModulo(@RequestBody Modulo m, @PathVariable("id") int id) {
		try {
			Modulo ul = service.buscarModulo(id);
			if (ul.getId() > 0) {
				ul.setNombre(m.getNombre());
				ul.setArea(m.getArea());
				ul.setDescripcion(m.getDescripcion());
				return new ResponseEntity<>(service.updatemodulo(ul), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// BUSCAR {ID}
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Modulo> buscarModulo(@PathVariable("id") int id) {
		Modulo m = service.buscarModulo(id);
		if (m.getId() > 0) {
			return new ResponseEntity<>(m, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
