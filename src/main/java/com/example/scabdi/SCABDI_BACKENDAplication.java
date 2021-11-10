package com.example.scabdi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.scabdi.entity.Sede;
import com.example.scabdi.repository.SedeRepository;


@SpringBootApplication
public class SpringJpa2Application implements CommandLineRunner{

	@Autowired
	private SedeRepository sedeRepository;
		
	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2Application.class, args);
	}

	//@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
									/*
		//LISTAR SEDE
		List<Sede> se = sedeRepository.listaSedes();
		for(int i=0;i<se.size(); i++) {
			System.out.println(se.get(i).getNombreSede());
		}
		*/
		/*
		//BUSCAR SEDE
		 Sede sede = sedeRepository.readId(4).get();
		 System.out.println("Sede: "+sede.getNombreSede());
		*/
		//AGREGAR SEDE
		//sedeRepository.saveSede("BENJAMIN", 1);
		
		//ELIMINAR SEDE
		//sedeRepository.eliminarSede(37);
	
	}

}
