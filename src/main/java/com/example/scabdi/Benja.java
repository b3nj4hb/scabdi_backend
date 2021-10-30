package com.example.scabdi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.scabdi.entity.Persona;

import com.example.scabdi.repository.PersonaRepository;

@SpringBootApplication
public class Benja implements CommandLineRunner{

	@Autowired
	private PersonaRepository personaRepository;
		
	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2Application.class, args);
	}

	//@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
	
	//PROVANDO LOS REPOSITORIOS
		
	//LISTAR PERSONA
	List<Persona> per = personaRepository.listarPersonas();
	for(int i=0;i<per.size(); i++) {
		System.out.println(
		per.get(i).getId()+" "+
		per.get(i).getNombre()+" \t"+
		per.get(i).getApellido()+" \t"+
		per.get(i).getDni()+" \t"+
		per.get(i).getCorreo()+" \t"+
		per.get(i).getTelefono());
	}
	
	/* 
	//BUSCAR PERSONA
	 Persona sona = personaRepository.buscarPersona(7).get();
	 System.out.println("Persona: "+sona.getNombre());
	 */
	//AGREGAR PERSONA
	//personaRepository.insertarPersona("Per", "Sona", "00000000", "Per@gmail.com", "000000000");
	
	//ELIMINAR PERSONA
	//personaRepository.eliminarPersona(7);
		
	//ACTUALIZAR PERSONA
	//personaRepository.actualizarPersona
	//(7, "PERSONA", "APELLIDO", "12345678", "CORREO@UPEU.EDU.PE", "123456789");
				
	}
}
