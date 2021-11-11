package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Socio;

public interface SocioService {

	List<Socio> readAll();

	Socio create(Socio al);

	Socio read(int id);

	void delete(int id);

	Socio update(Socio al);
	
}
