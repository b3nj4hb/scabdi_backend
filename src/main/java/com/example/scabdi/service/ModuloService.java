package com.example.scabdi.service;
import java.util.List;
import java.util.Map;

import com.example.scabdi.entity.Modulo;

public interface ModuloService {
	List<Modulo> readAll();
	Modulo create(Modulo mo);
	Modulo read(int id);
	void delete(int id);
	Modulo update(Modulo mo);
	List<Map<String,Object>> modulosporbanco();
	String updatemodulo(Modulo mo);
	Modulo buscarModulo(int id);
}
