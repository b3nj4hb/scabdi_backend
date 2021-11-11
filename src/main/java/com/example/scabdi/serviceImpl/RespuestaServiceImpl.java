package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Respuesta;
import com.example.scabdi.repository.RespuestaRepository;
import com.example.scabdi.service.RespuestaService;

@Service
public class RespuestaServiceImpl implements RespuestaService{

	@Autowired
	private RespuestaRepository repo;
	
	@Override
	public List<Respuesta> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Respuesta create(Respuesta al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Respuesta read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Respuesta update(Respuesta al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
