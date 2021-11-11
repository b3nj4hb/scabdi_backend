package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.BancoModulo;
import com.example.scabdi.repository.BancoModuloRepository;
import com.example.scabdi.service.BancoModuloService;

@Service
public class BancoModuloServiceImpl implements BancoModuloService{

	@Autowired
	private BancoModuloRepository repo;
	
	@Override
	public List<BancoModulo> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public BancoModulo create(BancoModulo al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public BancoModulo read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public BancoModulo update(BancoModulo al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
