package com.example.scabdi.service;
import java.util.List;

import com.example.scabdi.entity.Inscrito;


public interface InscritoService {
	List<Inscrito> readAll();
	Inscrito create(Inscrito in);
	Inscrito read(int in);
	void delete(int in);
	Inscrito update(Inscrito in);
}
