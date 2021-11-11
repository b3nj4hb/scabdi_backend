package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Usuario;

public interface UsuarioService {

	List<Usuario> readAll();

	Usuario create(Usuario al);

	Usuario read(int id);

	void delete(int id);

	Usuario update(Usuario al);
	
}
