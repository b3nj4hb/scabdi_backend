package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Persona;

public interface PersonaService {

	List<Persona> readAll();

	Persona create(Persona al);

	Persona read(int id);

	void delete(int id);

	Persona update(Persona al);
	
}
