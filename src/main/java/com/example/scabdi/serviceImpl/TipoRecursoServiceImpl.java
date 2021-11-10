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
	private TipoRecursoRepository tipoRecursoRepository;
	
	@Override
	public List<TipoRecurso> readAll() {
		// TODO Auto-generated method stub
		return tipoRecursoRepository.findAll();
	}

	@Override
	public TipoRecurso create(TipoRecurso al) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoRecurso read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TipoRecurso update(TipoRecurso al) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
