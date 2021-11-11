package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Respuesta;

public interface RespuestaService {

	List<Respuesta> readAll();

	Respuesta create(Respuesta al);

	Respuesta read(int id);

	void delete(int id);

	Respuesta update(Respuesta al);
	
}
