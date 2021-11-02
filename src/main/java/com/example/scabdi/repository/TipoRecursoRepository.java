package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import com.example.scabdi.entity.TipoRecurso;
import com.google.common.base.Optional;

public interface TipoRecursoRepository extends JpaRepository<TipoRecurso, Integer>{
	//LISTAR
			@Query(value = "{call SP_LISTA_TBL_TIPO_RECURSO()}", nativeQuery = true) 
			List<TipoRecurso> listartiporecurso();
	//BUSCAR
			@Query(value = "{call SP_BUSCAR_TBL_TIPO_RECURSO(:P_ID)}", nativeQuery = true)
			Optional<TipoRecurso> buscar(@Param("P_ID") int P_ID);		
	// INSERTAR
			@Query(value = "{call SP_INS_TBL_TIPO_RECURSO" + "(:NO_TIPO_RECURSO)}", nativeQuery = true)
			String insertar(@Param("NO_TIPO_RECURSO") String NO_TIPO_RECURSO);		
    // ELIMINAR
			@Query(value = "{call SP_DEL_TBL_TIPO_RECURSO(:P_ID)}", nativeQuery = true)
			String eliminar(@Param("P_ID") int P_ID);		
    // ACTULALIZAR
			@Query(value = "{CALL SP_UPD_TBL_PERSONA" + "(:P_ID_TIPO_RECURSO, :NO_TIPO_RECURSO)}", nativeQuery = true)
			String actualizar(@Param("P_ID_TIPO_RECURSO") int P_ID_TIPO_RECURSO, @Param("NO_TIPO_RECURSO") String NO_TIPO_RECURSO);		
}