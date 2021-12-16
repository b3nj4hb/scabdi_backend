package com.example.scabdi.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Socio;
import com.example.scabdi.repository.SocioRepository;
import com.example.scabdi.service.SocioService;

@Service
public class SocioServiceImpl implements SocioService{

	@Autowired
	private SocioRepository repo;
	
	@Override
	public List<Socio> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Socio create(Socio al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Socio read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Socio update(Socio al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public List<Map<String, Object>> socio() {
		// TODO Auto-generated method stub
		return repo.socio();
	}

	@Override
	public List<Map<String, Object>> datos(int id) {
		// TODO Auto-generated method stub
		return repo.datos(id);
	}

	@Override
	public List<Map<String, Object>> modulos(int id) {
		// TODO Auto-generated method stub
		return repo.modulos(id);
	}

	@Override
	public List<Map<String, Object>> pedidos(int id) {
		// TODO Auto-generated method stub
		return repo.pedidos(id);
	}

}
