package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.example.scabdi.entity.Usuario;
import com.google.common.base.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioRepository, Integer>{
	//LISTAR
			@Query(value = "{call SP_LISTA_TSG_USUARIO()}", nativeQuery = true) 
			List<Usuario> listarusuario();
	//BUSCAR
			@Query(value = "{call SP_BUSCAR_TSG_USUARIO(:P_ID)}", nativeQuery = true)
			Optional<Usuario> buscar(@Param("P_ID") int P_ID);		
	// INSERTAR
			@Query(value = "{call SP_INS_TSG_USUARIO" + "(:P_ID_PERSONA, :P_US_NOMBRE, :P_PW_USUARIO)}", nativeQuery = true)
			String insertar(@Param("P_ID_PERSONA") int P_ID_PERSONA, 
					        @Param("P_US_NOMBRE") String P_US_NOMBRE, 
					        @Param("P_PW_USUARIO") String P_PW_USUARIO);		
    // ELIMINAR
			@Query(value = "{call SP_DEL_TSG_USUARIO(:P_ID)}", nativeQuery = true)
			String eliminar(@Param("P_ID") int P_ID);		
    // ACTULALIZAR
			@Query(value = "{CALL SP_UPD_TSG_USUARIO" + "(:P_ID_PERSONA, :P_US_NOMBRE, :P_PW_USUARIO)}", nativeQuery = true)
			String actualizar(@Param("P_ID_PERSONA") int P_ID_PERSONA, 
					          @Param("P_US_NOMBRE") String P_US_NOMBRE, 
					          @Param("P_PW_USUARIO") String P_PW_USUARIO);		
}