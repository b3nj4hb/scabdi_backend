package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scabdi.project.Entity.Rol;
import com.scabdi.project.Repository.RolRepository;
import com.scabdi.project.Service.RolService;
@Service
public class RolServiceImpl implements RolService{

	@Autowired
	private RolRepository rolRepository;
	
	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

	@Override
	public Rol create(Rol rl) {
		// TODO Auto-generated method stub
		return rolRepository.save(rl);
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		return rolRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 rolRepository.deleteById(id);
	}

	@Override
	public Rol update(Rol rl) {
		// TODO Auto-generated method stub
		return rolRepository.save(rl);
	}

}
