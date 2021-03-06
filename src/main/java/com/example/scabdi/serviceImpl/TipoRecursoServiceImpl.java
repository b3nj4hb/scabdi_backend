package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.TipoRecurso;
import com.example.scabdi.service.TipoRecursoService;
import com.example.scabdi.repository.TipoRecursoRepository;

@Service
public class TipoRecursoServiceImpl implements TipoRecursoService{

	@Autowired
	private TipoRecursoRepository repo;
	
	@Override
	public List<TipoRecurso> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public TipoRecurso create(TipoRecurso al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public TipoRecurso read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public TipoRecurso update(TipoRecurso al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	
}
