package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.UsuarioRol;

public interface UsuarioRolService {

	List<UsuarioRol> readAll();

	UsuarioRol create(UsuarioRol al);

	UsuarioRol read(int id);

	void delete(int id);

	UsuarioRol update(UsuarioRol al);
	
}
