package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Inscrito;

public interface InscritoService {

	List<Inscrito> readAll();

	Inscrito create(Inscrito al);

	Inscrito read(int id);

	void delete(int id);

	Inscrito update(Inscrito al);
	
}
