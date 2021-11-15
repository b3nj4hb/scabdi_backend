package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Pregunta;

public interface PreguntaService {

	List<Pregunta> readAll();

	Pregunta create(Pregunta al);

	Pregunta read(int id);

	void delete(int id);

	Pregunta update(Pregunta al);
	
}
