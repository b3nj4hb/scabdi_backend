package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Prueba;

public interface PruebaService {

	List<Prueba> readAll();

	Prueba create(Prueba al);

	Prueba read(int id);

	void delete(int id);

	Prueba update(Prueba al);
	
}
