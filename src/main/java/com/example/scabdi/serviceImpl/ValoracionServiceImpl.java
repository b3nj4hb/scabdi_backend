package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Valoracion;
import com.example.scabdi.repository.ValoracionRepository;
import com.example.scabdi.service.ValoracionService;

@Service
public class ValoracionServiceImpl implements ValoracionService{

	@Autowired
	private ValoracionRepository repo;
	
	@Override
	public List<Valoracion> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Valoracion create(Valoracion al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Valoracion read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Valoracion update(Valoracion al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
