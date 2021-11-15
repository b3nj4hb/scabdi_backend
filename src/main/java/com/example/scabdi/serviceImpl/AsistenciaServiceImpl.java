package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Asistencia;
import com.example.scabdi.repository.AsistenciaRepository;
import com.example.scabdi.service.AsistenciaService;

@Service
public class AsistenciaServiceImpl implements AsistenciaService{

	@Autowired
	private AsistenciaRepository asis;
	
	@Override
	public List<Asistencia> readAll() {
		// TODO Auto-generated method stub
		return asis.findAll();
	}

	@Override
	public Asistencia create(Asistencia al) {
		// TODO Auto-generated method stub
		return asis.save(al);
	}

	@Override
	public Asistencia read(int id) {
		// TODO Auto-generated method stub
		return asis.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		asis.deleteById(id);
	}

	@Override
	public Asistencia update(Asistencia al) {
		// TODO Auto-generated method stub
		return asis.save(al);
	}

	
	
}
