package com.example.scabdi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.scabdi.entity.*;
import com.example.scabdi.repository.*;

@SpringBootApplication
public class Josue implements CommandLineRunner {
	@Autowired
	private TipoRecursoRepository tiporepRecursoRepository;
	@Autowired
	private SocioRepository socioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//--------------Tipo_Recurso------------------
		
		/*// Listar Tipo_Recurso
		List<Tipo_recurso> se = tiporepRecursoRepository.listartiporecurso();
		for (int i = 0; i < se.size(); i++) {
			System.out.println(se.get(i).getId());
			System.out.println(se.get(i).getNombre());
		}
		
		// Buscar Tipo_Recurso
		Tipo_recurso rl = tiporepRecursoRepository.buscar(5).get();
		System.out.println(rl.getId() + " - " + rl.getNombre());
		
		// Agregar Tipo_Recurso
		tiporepRecursoRepository.insertar("Preguntas");

		// Eliminar Tipo_Recurso
		tiporepRecursoRepository.eliminar(7);

		// Actualizar Tipo_Recurso
		tiporepRecursoRepository.actualizar(7, "");*/
		
		//--------------Socio------------------------
		
		// Listar Socio
		List<SocioRepository> se = socioRepository.listarsocio();
		for (int i = 0; i < se.size(); i++) {
			System.out.println(se.get(i).getId());
			System.out.println(se.get(i).getNombre());
		}
		
		// Buscar Tipo_Recurso
		Tipo_recurso rl = tiporepRecursoRepository.buscar(5).get();
		System.out.println(rl.getId() + " - " + rl.getNombre());
		
		// Agregar Tipo_Recurso
		tiporepRecursoRepository.insertar("Preguntas");

		// Eliminar Tipo_Recurso
		tiporepRecursoRepository.eliminar(7);

		// Actualizar Tipo_Recurso
		tiporepRecursoRepository.actualizar(7, "");

	}

}