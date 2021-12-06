package com.example.scabdi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.scabdi.entity.*;

import com.example.scabdi.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@SpringBootApplication
public class Benja implements CommandLineRunner {

	@Autowired
	private PersonaRepository personaRepository;
	@Autowired
	private ProgresoRepository progresoRepository;
	@Autowired
	private RecursoRepository recursoRepository;
	@Autowired
	private RolPrivilegioRepository rpRepository;

	public static void main(String[] args) {
		
		SpringApplication.run(Benja.class, args);

        System.out.println(bCryptPasswordEncoder.encode("dl32@123").toString()); 
	}
	static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    
	// @SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		 
		// ----------- PERSONA -----------

		// LISTAR PERSONA
		/*
		 * List<Persona> per = personaRepository.listar(); for (int i = 0; i <
		 * per.size(); i++) { System.out.println( per.get(i).getId() + " - " +
		 * per.get(i).getNombre() + " - " + per.get(i).getApellido() + " - "); }
		 */
		// BUSCAR PERSONA
		/*
		 * Persona sona = personaRepository.buscar(6).get();
		 * System.out.println(sona.getId() + " - " + sona.getNombre() + " - " +
		 * sona.getApellido());
		 */
		// AGREGAR PERSONA
		// personaRepository.insertar("Per", "Sona", "00000000", "Per@gmail.com",
		// "000000000");

		// ELIMINAR PERSONA
		// personaRepository.eliminar(7);

		// ACTUALIZAR PERSONA
		// personaRepository.actualizar
		// (7, "PERSONA", "APELLIDO", "12345678", "CORREO@UPEU.EDU.PE", "123456789");

		// ----------- PROGRESO -----------

		// LISTAR PROGRESO
		/*
		 * List<Progreso> pro = progresoRepository.listar(); for (int i = 0; i <
		 * pro.size(); i++) { System.out.println(pro.get(i).getId() + " - " +
		 * pro.get(i).getId_inscrito() + " - " + pro.get(i).getId_recurso() + " - "); }
		 */
		// BUSCAR PROGRESO
		/*
		 * Progreso greso = progresoRepository.buscar(4).get();
		 * System.out.println("Progreso: " + greso.getId_inscrito());
		 */
		// AGREGAR PROGRESO
		// progresoRepository.insertar(1, 1, 1);

		// ELIMINAR PROGRESO
		// progresoRepository.eliminar(4);

		// ACTUALIZAR PROGRESO
		// progresoRepository.actualizar(4, 6, 2, 0);

		// ----------- RECURSO -----------

		// LISTAR RECURSO
		/*
		 * List<Recurso> rec = recursoRepository.listar(); for (int i = 0; i <
		 * rec.size(); i++) { System.out.println(rec.get(i).getId() + " " +
		 * rec.get(i).getNo_recurso()+ " "+rec.get(i).getId_sesion()); }
		 */
		// BUSCAR RECURSO
		// Recurso urso = recursoRepository.buscar(2).get();
		// System.out.println("Recurso: " + urso.getNombre());

		// AGREGAR RECURSO
		// recursoRepository.insertar(1, 1, "PRUEBA", "BACKEND", "URL PRUEBA");

		// ELIMINAR RECURSO
		// recursoRepository.eliminar(4);

		// ACTUALIZAR RECURSO
		// recursoRepository.actualizar(4, 2, 2, "ACTUALIZADO", "PRUEBA", "URL
		// ACTUALIZADA");

		// ----------- ROL PRIVILEGIO -----------

		// LISTAR ROL PRIVILEGIO
		/*
		 * List<RolPrivilegio> rp = rpRepository.listar(); for (int i = 0; i <
		 * rp.size(); i++) { System.out.println( rp.get(i).getId() + " " +
		 * rp.get(i).getId_privilegio() + " \t" + rp.get(i).getId_rol() + " \t"); }
		 */
		// BUSCAR ROL PRIVILEGIO
		/*
		 * RolPrivilegio rpr = rpRepository.buscar(1).get();
		 * System.out.println("Busqueda: - "+rpr.getId()+" - "+rpr.getId_privilegio()
		 * +" - "+rpr.getId_rol());
		 */
		// AGREGAR ROL PRIVILEGIO
		// rpRepository.insertar(2, 1);

		// ELIMINAR ROL PRIVILEGIO
		// rpRepository.eliminar(11);

		// ACTUALIZAR ROL PRIVILEGIO
		// rpRepository.actualizar(11, 2, 2);

	}
}
