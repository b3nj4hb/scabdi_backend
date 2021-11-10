package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Recurso;
import com.example.scabdi.repository.RecursoRepository;
import com.example.scabdi.service.RecursoService;

@Service
public class RecursoServiceImpl implements RecursoService{

	@Autowired
	private RecursoRepository recursoRepository;
	
	@Override
	public List<Recurso> readAll() {
		// TODO Auto-generated method stub
		return recursoRepository.findAll();
	}

	@Override
	public Recurso create(Recurso al) {
		// TODO Auto-generated method stub
		return recursoRepository.save(al);
	}

	@Override
	public Recurso read(int id) {
		// TODO Auto-generated method stub
		return recursoRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		recursoRepository.deleteById(id);
	}

	@Override
	public Recurso update(Recurso al) {
		// TODO Auto-generated method stub
		return recursoRepository.save(al);
	}

}
