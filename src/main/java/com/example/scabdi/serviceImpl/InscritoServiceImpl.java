package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Inscrito;
import com.example.scabdi.repository.InscritoRepository;
import com.example.scabdi.service.InscritoService;

@Service
public class InscritoServiceImpl implements InscritoService{

	@Autowired
	private InscritoRepository repo;
	
	@Override
	public List<Inscrito> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Inscrito create(Inscrito al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Inscrito read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Inscrito update(Inscrito al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
