package com.example.scabdi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Recurso;

@Repository
public interface RecursoRepository extends JpaRepository<Recurso, Integer>{
	// LISTAR
	@Query(value = "{call SP_LISTA_TBL_RECURSO()}", nativeQuery = true)
	List<Recurso> listar();

	// BUSCAR
	@Query(value = "{call SP_BUSCAR_TBL_RECURSO(:P_ID)}", nativeQuery = true)
	Optional<Recurso> buscar(@Param("P_ID") int P_ID);

	// INSERTAR
	@Query(value = "{call SP_INS_TBL_RECURSO (:P_ID_SESION, :P_ID_TIPO_RECURSO, :P_NO_RECURSO, :P_FI_RECURSO,"
			+ " :P_URL_RECURSO, @P_ID)}", nativeQuery = true)
	String insertar(@Param("P_ID_SESION") int P_ID_SESION, @Param("P_ID_TIPO_RECURSO") int P_ID_TIPO_RECURSO,
			@Param("P_NO_RECURSO") String P_NO_RECURSO, @Param("P_FI_RECURSO") String P_FI_RECURSO,
			@Param("P_URL_RECURSO") String P_URL_RECURSO);

	// ELIMINAR
	@Query(value = "{call SP_DEL_TBL_RECURSO(:P_ID)}", nativeQuery = true)
	String eliminar(@Param("P_ID") int P_ID);

	// ACTULALIZAR
	@Query(value = "{CALL SP_UPD_TBL_RECURSO (:P_ID_RECURSO, :P_ID_SESION, :P_ID_TIPO_RECURSO, "
			+ ":P_NO_RECURSO, :P_FI_RECURSO, :P_URL_RECURSO, @P_OK)}", nativeQuery = true)
	String actualizar(@Param("P_ID_RECURSO") int P_ID_RECURSO, @Param("P_ID_SESION") int P_ID_SESION,
			@Param("P_ID_TIPO_RECURSO") int P_ID_TIPO_RECURSO, @Param("P_NO_RECURSO") String P_NO_RECURSO,
			@Param("P_FI_RECURSO") String P_FI_RECURSO, @Param("P_URL_RECURSO") String P_URL_RECURSO);
	
	
	
}
