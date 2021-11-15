package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Asistencia;

public interface AsistenciaService {

	List<Asistencia> readAll();

	Asistencia create(Asistencia al);

	Asistencia read(int id);

	void delete(int id);

	Asistencia update(Asistencia al);
	
}
