package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Conferencia;
import com.example.scabdi.repository.ConferenciaRepository;
import com.example.scabdi.service.ConferenciaService;

@Service
public class ConferenciaServiceImpl implements ConferenciaService{

	@Autowired
	private ConferenciaRepository repo;
	
	@Override
	public List<Conferencia> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Conferencia create(Conferencia al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Conferencia read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Conferencia update(Conferencia al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
