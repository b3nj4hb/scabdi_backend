package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Sede;

public interface SedeService {

	List<Sede> readAll();

	Sede create(Sede al);

	Sede read(int id);

	void delete(int id);

	Sede update(Sede al);
	
}
