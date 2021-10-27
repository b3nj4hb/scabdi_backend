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
    
	@Query(value = "{call SP_LISTA_TBL_PERSONA()}", nativeQuery = true) 
	List<Persona> listaPersonas();
	
	@Query(value = "{call SP_BUSCAR_TBL_Persona(:p_nID_Persona)}", nativeQuery = true) 
	Optional<Persona> readId(@Param("p_nID_Persona") int V_ID);
	
	
	@Query(value = "{call SP_INS_TBL_Persona"
			+ "(:p_vNO_Persona, :p_nES_Persona, @p_nID_Persona)}", nativeQuery = true) 
	String savePersona(@Param("p_vNO_Persona") String P_NO_Persona,
			@Param("p_nES_Persona") int P_ES_Persona);
	/*
	@Query(value="Alter table TBL_Persona auto_increment = 0", nativeQuery=true)
	String reiniciarAutoIncrement();
	*/
	@Query(value="{call SP_DEL_TBL_Persona(:p_nID_Persona)}", nativeQuery = true)
	String eliminarPersona(@Param("p_nID_Persona") int P_ID_Persona);

}
