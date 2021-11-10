package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Progreso;
import com.example.scabdi.repository.ProgresoRepository;
import com.example.scabdi.service.ProgresoService;

@Service
public class ProgresoServiceImpl implements ProgresoService{

	@Autowired
	private ProgresoRepository progresoRepository;
	
	@Override
	public List<Progreso> readAll() {
		// TODO Auto-generated method stub
		return progresoRepository.findAll();
	}

	@Override
	public Progreso create(Progreso al) {
		// TODO Auto-generated method stub
		return progresoRepository.save(al);
	}

	@Override
	public Progreso read(int id) {
		// TODO Auto-generated method stub
		return progresoRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		progresoRepository.deleteById(id);
	}

	@Override
	public Progreso update(Progreso al) {
		// TODO Auto-generated method stub
		return progresoRepository.save(al);
	}

	
	
}
