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

import com.example.scabdi.entity.Persona;
import com.example.scabdi.service.PersonaService;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	// CREAR
	@PostMapping("/create")
	public ResponseEntity<Persona> save(@RequestBody Persona per) {
		try {
			Persona p = personaService.create(new Persona(per.getId(), per.getNombre(), per.getApellido(), per.getDni(),
					per.getCorreo(), per.getTelefono()));
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// LISTAR
	@GetMapping("/all")
	public ResponseEntity<List<Persona>> list() {
		try {
			List<Persona> list = new ArrayList<>();
			list = personaService.readAll();
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
	public ResponseEntity<Persona> search(@PathVariable("id") int id) {
		Persona persona = personaService.read(id);
		if (persona.getId() > 0) {
			return new ResponseEntity<>(persona, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// ELIMINAR
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id) {
		try {
			personaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// ACTUALIZAR {ID}
	@PutMapping("/update/{id}")
	public ResponseEntity<Persona> update(@RequestBody Persona p, @PathVariable("id") int id) {
		try {
			Persona pe = personaService.read(id);
			if (pe.getId() > 0) {
				pe.setNombre(p.getNombre());
				pe.setApellido(p.getApellido());
				pe.setDni(p.getDni());
				pe.setCorreo(p.getCorreo());
				pe.setTelefono(p.getTelefono());

				return new ResponseEntity<>(personaService.create(pe), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
