package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.BancoModulo;

public interface BancoModuloService {

	List<BancoModulo> readAll();

	BancoModulo create(BancoModulo al);

	BancoModulo read(int id);

	void delete(int id);

	BancoModulo update(BancoModulo al);
	
}
