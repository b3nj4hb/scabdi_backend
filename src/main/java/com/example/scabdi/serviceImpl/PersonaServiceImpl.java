package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Persona;
import com.example.scabdi.service.PersonaService;

import com.example.scabdi.entity.Persona;
import com.example.scabdi.repository.PersonaRepository;
import com.example.scabdi.service.PersonaService;

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
		return null;
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persona update(Persona al) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
