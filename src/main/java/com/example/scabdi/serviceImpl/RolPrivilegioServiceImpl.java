package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.RolPrivilegio;
import com.example.scabdi.repository.RolPrivilegioRepository;
import com.example.scabdi.service.RolPrivilegioService;

@Service
public class RolPrivilegioServiceImpl implements RolPrivilegioService{

	@Autowired
	private RolPrivilegioRepository rolPrivRepo;
	
	@Override
	public List<RolPrivilegio> readAll() {
		// TODO Auto-generated method stub
		return rolPrivRepo.findAll();
	}

	@Override
	public RolPrivilegio create(RolPrivilegio al) {
		// TODO Auto-generated method stub
		return rolPrivRepo.save(al);
	}

	@Override
	public RolPrivilegio read(int id) {
		// TODO Auto-generated method stub
		return rolPrivRepo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		rolPrivRepo.deleteById(id);
	}

	@Override
	public RolPrivilegio update(RolPrivilegio al) {
		// TODO Auto-generated method stub
		return rolPrivRepo.save(al);
	}

}
