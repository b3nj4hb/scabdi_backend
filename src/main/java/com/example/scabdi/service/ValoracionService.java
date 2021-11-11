package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Valoracion;

public interface ValoracionService {

	List<Valoracion> readAll();

	Valoracion create(Valoracion al);

	Valoracion read(int id);

	void delete(int id);

	Valoracion update(Valoracion al);
	
}
