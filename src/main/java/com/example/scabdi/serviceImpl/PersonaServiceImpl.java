package com.example.scabdi.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Persona;
import com.example.scabdi.service.PersonaService;
import com.example.scabdi.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	@Override
	public Persona create(Persona al) {
		// TODO Auto-generated method stub
		return personaRepository.save(al);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return personaRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		personaRepository.deleteById(id);
	}

	@Override
	public Persona update(Persona al) {
		// TODO Auto-generated method stub
		return personaRepository.save(al);
	}

	@Override
	public List<Map<String, Object>> listarpersona(int id) {
		// TODO Auto-generated method stub
		return personaRepository.listarpersona(id);
	}

	
}
