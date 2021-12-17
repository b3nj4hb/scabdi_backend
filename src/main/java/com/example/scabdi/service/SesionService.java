package com.example.scabdi.service;

import java.util.List;
import java.util.Map;

import com.example.scabdi.entity.Sesion;

public interface SesionService {

	List<Sesion> readAll();

	Sesion create(Sesion al);

	Sesion read(int id);

	void delete(int id);

	Sesion update(Sesion al);
	
	List<Map<String, Object>> listarsesion();
	
	List<Map<String, Object>> listarrecurso(int id);
	
	List<Map<String,Object>> listarecurso(int id);
	
	List<Map<String, Object>> sesionactiva(int id);
	
	List<Map<String, Object>> idpersona(int id);
	
}
