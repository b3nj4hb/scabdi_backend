package com.example.scabdi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
    //LISTAR
	@Query(value = "{call SP_LISTA_TBL_PERSONA()}", nativeQuery = true) 
	List<Persona> listarPersonas();
	//BUSCAR
	@Query(value = "{call SP_BUSCAR_TBL_PERSONA(:P_ID)}", nativeQuery = true) 
	Optional<Persona> buscarPersona(@Param("P_ID") int P_ID);
	//INSERTAR
	@Query(value = "{call SP_INS_TBL_Persona"
			+ "(:P_NO_PERSONA, :P_AP_PERSONA, :P_NU_DNI,"
			+ " :P_EM_CORREO, :P_NU_TELEFONO, @P_ID)}", nativeQuery = true) 
	String insertarPersona
		(@Param("P_NO_PERSONA") String P_NO_PERSONA,
		@Param("P_AP_PERSONA") String P_AP_PERSONA,
		@Param("P_NU_DNI") String P_NU_DNI,
		@Param("P_EM_CORREO") String P_EM_CORREO,
		@Param("P_NU_TELEFONO") String P_NU_TELEFONO);
	//ELIMINAR
	@Query(value="{call SP_DEL_TBL_Persona(:P_ID)}", nativeQuery = true)
	String eliminarPersona(@Param("P_ID") int P_ID);
	
	@Query (value = "{CALL SP_UPD_TBL_PERSONA"
			+ "(:P_ID_PERSONA, :P_NO_PERSONA, :P_AP_PERSONA, "
			+ ":P_NU_DNI, :P_EM_CORREO, :P_NU_TELEFONO, @P_OK)}", nativeQuery = true)
	String actualizarPersona
	(@Param("P_ID_PERSONA") int P_ID_PERSONA,
	@Param("P_NO_PERSONA") String P_NO_PERSONA,
	@Param("P_AP_PERSONA") String P_AP_PERSONA,
	@Param("P_NU_DNI") String P_NU_DNI,
	@Param("P_EM_CORREO") String P_EM_CORREO,
	@Param("P_NU_TELEFONO") String P_NU_TELEFONO
	);
}
