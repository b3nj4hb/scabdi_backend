package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Modulo;

public interface ModuloService {

	List<Modulo> readAll();

	Modulo create(Modulo al);

	Modulo read(int id);

	void delete(int id);

	Modulo update(Modulo al);
	
}
