package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Modulo;
import com.example.scabdi.repository.ModuloRepository;
import com.example.scabdi.service.ModuloService;

@Service
public class ModuloServiceImpl implements ModuloService{

	@Autowired
	private ModuloRepository repo;
	
	@Override
	public List<Modulo> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Modulo create(Modulo al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Modulo read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Modulo update(Modulo al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
