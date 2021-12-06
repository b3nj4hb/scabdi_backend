package com.example.scabdi.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Sesion;
import com.example.scabdi.repository.SesionRepository;
import com.example.scabdi.service.SesionService;

@Service
public class SesionServiceImpl implements SesionService{

	@Autowired
	private SesionRepository repo;
	
	@Override
	public List<Sesion> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Sesion create(Sesion al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Sesion read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Sesion update(Sesion al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public List<Map<String, Object>> listarrecurso(int id) {
		// TODO Auto-generated method stub
		return repo.listarrecurso(id);
	}

	@Override
	public List<Map<String, Object>> listarsesion() {
		// TODO Auto-generated method stub
		return repo.listarsesion();
	}

	@Override
	public List<Map<String, Object>> listarecurso(int id) {
		// TODO Auto-generated method stub
		return repo.listarecurso(id);
	}

}
