package com.example.scabdi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.scabdi.entity.BancoComunal;
import com.example.scabdi.entity.Persona;
import com.example.scabdi.entity.Sede;
import com.example.scabdi.repository.PersonaRepository;



@SpringBootApplication
public class SpringJpa2Application implements CommandLineRunner{

	@Autowired
	private PersonaRepository personaRepository;
		
	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2Application.class, args);
	}

	//@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		
		//Registrar Persona
		/*
		Persona per = new Persona();
		per.setNombre("PersonaNombre");
		per.setApellido("PersonaApellido");
		per.setDni("12345678");
		per.setCorreo("correo@ejemplo.com");
		per.setTelefono("123456789");
		*/
		//Repository.saveSede("BENJAMIN", 1);
		//LISTAR PERSONA
		List<Persona> per = personaRepository.listaPersonas();
		for(int i=0;i<per.size(); i++) {
			System.out.println(per.get(i).getNombre());
		}

		//REGISTRAR SEDE
		Sede sed = new Sede();
		sed.setNombreSede("111111");
		sed.setEstadoSede(1);
		//sedeRepository.save(sed);
		
		//REGISTAR BANCO COMUNAL
		BancoComunal bc = new BancoComunal();
		bc.setIdsede(sed);
		bc.setNo_bancocomunal("111111");
		bc.setEs_bancocomunal(1);
		//bancoComunalRepository.save(bc);
	
		/*
		//LISTAR SEDE
		List<Sede> se = sedeRepository.listaSedes();
		for(int i=0;i<se.size(); i++) {
			System.out.println(se.get(i).getNombreSede());
		}
		*/
		//BUSCAR SEDE
		// Sede sede = sedeRepository.readId(4).get();
		// System.out.println("Sede: "+sede.getNombreSede());
		
		//AGREGAR SEDE
		//sedeRepository.saveSede("BENJAMIN", 1);
		
		//ELIMINAR SEDE
		//sedeRepository.eliminarSede(37);
	
	}

}
