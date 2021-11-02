package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.TipoRecurso;

public interface TipoRecursoService {

	List<TipoRecurso> readAll();

	TipoRecurso create(TipoRecurso al);

	TipoRecurso read(int id);

	void delete(int id);

	TipoRecurso update(TipoRecurso al);
	
}
