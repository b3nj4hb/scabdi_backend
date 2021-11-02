package com.example.scabdi;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.scabdi.entity.Tipo_recurso;
import com.example.scabdi.repository.TipoRecursoRepository;


@SpringBootApplication
public class Josue implements CommandLineRunner{
@Autowired
private TipoRecursoRepository tiporepRecursoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Listar Rol
		List<Tipo_recurso> se = tiporepRecursoRepository.listartiporecurso();
		for(int i=0;i<se.size(); i++) {
		System.out.println(se.get(i).getId());
		System.out.println(se.get(i).getNombre());
		 }
	    //BUSCAR ROL
				 Tipo_recurso rl = tiporepRecursoRepository.buscar(5).get();
				 System.out.println(rl.getId() + " - " + rl.getNombre());	    
		
		
	}

}