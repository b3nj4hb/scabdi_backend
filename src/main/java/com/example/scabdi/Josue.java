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
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	
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
		
		/*// Listar Socio
		List<Socio> se = socioRepository.listarsocio();
		for (int i = 0; i < se.size(); i++) {
			System.out.println(se.get(i).getId_p());
			System.out.println(se.get(i).getId_b());
		}
		
		// Buscar Socio
		Socio rl = socioRepository.buscar(5).get();
		System.out.println(rl.getId_p() + " - " + rl.getId_b());
		
		// Agregar Socio
		socioRepository.insertar(1,2);

		// Eliminar Socio
		socioRepository.eliminar(7);

		// Actualizar Socio
		socioRepository.actualizar(7, 1);*/
		
		//--------------Usuario-----------------------
		
		/*// Listar Usuario
		List<Usuario> se = usuarioRepository.listarusuario();
		for (int i = 0; i < se.size(); i++) {
			System.out.println(se.get(i).getId());
			System.out.println(se.get(i).getNombre());
			System.out.println(se.get(i).getContraseña());
		}
		
		// Buscar Usuario
		Usuario rl = usuarioRepository.buscar(1).get();
		System.out.println(rl.getId() + " - " + rl.getNombre() + " - " + rl.getContraseña());
		
		// Agregar Usuario
		usuarioRepository.insertar(1,"David", "contraseña123");

		// Eliminar Usuario
		usuarioRepository.eliminar(7);

		// Actualizar Usuario
		usuarioRepository.actualizar(1, "Josue", "contraseña");*/
		
		//-----------------Pedido--------------------
		
		// Listar Pedido
		/*
		List<Pedido> se = pedidoRepository.listarpedido();
		for (int i = 0; i < se.size(); i++) {
			System.out.println(se.get(i).getId());
			System.out.println(se.get(i).getId_p());
			System.out.println(se.get(i).getDescripcion());
			System.out.println(se.get(i).getFecha());
		}
		*/
		// Buscar Pedido
		/*
		Pedido rl = pedidoRepository.buscar(1).get();
		System.out.println(rl.getId() + " - " + rl.getId_p() + " - " + rl.getDescripcion() + " - " + rl.getFecha());
		*/
		// Agregar Pedido
		//pedidoRepository.insertar(1,"Descripcion Interesante de prueba", "12/12/22");

		// Eliminar Pedido
		//pedidoRepository.eliminar(7);

		// Actualizar Pedido
		//pedidoRepository.actualizar(2,"Descripcion de prueba testeo 2");
	}

}