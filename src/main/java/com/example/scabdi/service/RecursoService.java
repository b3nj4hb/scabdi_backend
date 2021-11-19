package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Recurso;

public interface RecursoService {

	List<Recurso> readAll();
	Recurso create(Recurso al);
	Recurso read(int id);
	void delete(int id);
	Recurso update(Recurso al);
	
}
