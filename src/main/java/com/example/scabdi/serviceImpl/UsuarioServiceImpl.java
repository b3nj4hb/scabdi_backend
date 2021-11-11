package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Usuario;
import com.example.scabdi.repository.UsuarioRepository;
import com.example.scabdi.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository repo;
	
	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	@Override
	public Usuario create(Usuario al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Usuario update(Usuario al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
