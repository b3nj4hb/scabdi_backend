package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.example.scabdi.entity.Socio;


@Repository
public interface SocioRepository extends JpaRepository<Socio, Integer>{
	//LISTAR
			@Query(value = "{call SP_LISTA_TBL_SOCIO()}", nativeQuery = true) 
			List<Socio> listarsocio();
	//BUSCAR
			@Query(value = "{call SP_BUSCAR_TBL_SOCIO(:P_ID)}", nativeQuery = true)
			Optional<Socio> buscar(@Param("P_ID") int P_ID);		
	// INSERTAR
			@Query(value = "{call SP_INS_TBL_SOCIO" + "(:P_ID_PERSONA, :P_ID_BANCO_COMUNAL)}", nativeQuery = true)
			String insertar(@Param("P_ID_PERSONA") int P_ID_PERSONA, @Param("P_ID_BANCO_COMUNAL") int P_ID_BANCO_COMUNAL);		
    // ELIMINAR
			@Query(value = "{call SP_DEL_TBL_SOCIO(:P_ID)}", nativeQuery = true)
			String eliminar(@Param("P_ID") int P_ID);		
    // ACTULALIZAR
			@Query(value = "{CALL SP_UPD_TBL_SOCIO" + "(:P_ID_PERSONA, :P_ID_BANCO_COMUNAL)}", nativeQuery = true)
			String actualizar(@Param("P_ID_PERSONA") int P_ID_PERSONA, @Param("P_ID_BANCO_COMUNAL") int P_ID_BANCO_COMUNAL);		
}