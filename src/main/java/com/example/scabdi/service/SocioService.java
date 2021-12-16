package com.example.scabdi.service;

import java.util.List;
import java.util.Map;

import com.example.scabdi.entity.Socio;

public interface SocioService {

	List<Socio> readAll();

	Socio create(Socio al);

	Socio read(int id);

	void delete(int id);

	Socio update(Socio al);
	
	List<Map<String,Object>> socio();
	List<Map<String,Object>> datos(int id);
	List<Map<String,Object>> modulos(int id);
	List<Map<String,Object>> pedidos(int id);
}
