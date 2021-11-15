package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.UsuarioRol;
import com.example.scabdi.repository.UsuarioRolRepository;
import com.example.scabdi.service.UsuarioRolService;

@Service
public class UsuarioRolServiceImpl implements UsuarioRolService{

	@Autowired
	private UsuarioRolRepository repo;
	
	@Override
	public List<UsuarioRol> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public UsuarioRol create(UsuarioRol al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public UsuarioRol read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public UsuarioRol update(UsuarioRol al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
