package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.BancoComunal;
import com.example.scabdi.repository.BancoComunalRepository;
import com.example.scabdi.service.BancoComunalService;

@Service
public class BancoComunalServiceImpl implements BancoComunalService{

	@Autowired
	private BancoComunalRepository repo;
	
	@Override
	public List<BancoComunal> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public BancoComunal create(BancoComunal al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public BancoComunal read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public BancoComunal update(BancoComunal al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
