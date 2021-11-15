package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Conferencia;

public interface ConferenciaService {

	List<Conferencia> readAll();

	Conferencia create(Conferencia al);

	Conferencia read(int id);

	void delete(int id);

	Conferencia update(Conferencia al);
	
}
