package com.example.scabdi.service;

import java.util.List;
import java.util.Map;

import com.example.scabdi.entity.Conferencia;

public interface ConferenciaService {

	List<Conferencia> readAll();

	Conferencia create(Conferencia al);

	Conferencia read(int id);

	void delete(int id);

	Conferencia update(Conferencia al);
	List<Map<String,Object>> digi(int id);
	List<Map<String,Object>> seminarioactual();
}
