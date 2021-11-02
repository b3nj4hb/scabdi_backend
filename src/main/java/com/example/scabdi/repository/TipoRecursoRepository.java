package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import com.example.scabdi.entity.Tipo_recurso;
import com.google.common.base.Optional;

public interface TipoRecursoRepository extends JpaRepository<Tipo_recurso, Integer>{
	//LISTAR
			@Query(value = "{call SP_LISTA_TBL_TIPO_RECURSO()}", nativeQuery = true) 
			List<Tipo_recurso> listartiporecurso();
	//BUSCAR
			@Query(value = "{call SP_BUSCAR_TBL_TIPO_RECURSO(:P_ID)}", nativeQuery = true)
			Optional<Tipo_recurso> buscar(@Param("P_ID") int P_ID);		
}