package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Prueba;
import com.example.scabdi.repository.PruebaRepository;
import com.example.scabdi.service.PruebaService;

@Service
public class PruebaServiceImpl implements PruebaService{

	@Autowired
	private PruebaRepository repo;
	
	@Override
	public List<Prueba> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Prueba create(Prueba al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Prueba read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Prueba update(Prueba al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
