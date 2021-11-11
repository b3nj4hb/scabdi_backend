package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Sede;
import com.example.scabdi.repository.SedeRepository;
import com.example.scabdi.service.SedeService;

@Service
public class SedeServiceImpl implements SedeService{

	@Autowired
	private SedeRepository repo;
	
	@Override
	public List<Sede> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Sede create(Sede al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Sede read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Sede update(Sede al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
