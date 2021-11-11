package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Privilegio;
import com.example.scabdi.repository.PrivilegioRepository;
import com.example.scabdi.service.PrivilegioService;

@Service
public class PrivilegioServiceImpl implements PrivilegioService{

	@Autowired
	private PrivilegioRepository repo;
	
	@Override
	public List<Privilegio> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Privilegio create(Privilegio al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Privilegio read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Privilegio update(Privilegio al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
