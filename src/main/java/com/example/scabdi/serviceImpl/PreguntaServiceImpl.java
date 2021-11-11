package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Pregunta;
import com.example.scabdi.repository.PreguntaRepository;
import com.example.scabdi.service.PreguntaService;

@Service
public class PreguntaServiceImpl implements PreguntaService{

	@Autowired
	private PreguntaRepository repo;
	
	@Override
	public List<Pregunta> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Pregunta create(Pregunta al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Pregunta read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Pregunta update(Pregunta al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
