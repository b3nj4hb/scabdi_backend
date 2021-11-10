package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Progreso;

public interface ProgresoService {

	List<Progreso> readAll();

	Progreso create(Progreso al);

	Progreso read(int id);

	void delete(int id);

	Progreso update(Progreso al);
	
	
}
