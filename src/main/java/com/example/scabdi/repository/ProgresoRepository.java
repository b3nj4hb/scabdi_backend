package com.example.scabdi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Progreso;

@Repository
public interface ProgresoRepository extends JpaRepository<Progreso, Integer> {
	// LISTAR
	@Query(value = "{call SP_LISTA_TBL_PROGRESO()}", nativeQuery = true)
	List<Progreso> listar();

	// BUSCAR
	@Query(value = "{call SP_BUSCAR_TBL_PROGRESO(:P_ID)}", nativeQuery = true)
	Optional<Progreso> buscar(@Param("P_ID") int P_ID);

	// INSERTAR
	@Query(value = "{call SP_INS_TBL_PROGRESO (:P_ID_INSCRITO, :P_ID_RECURSO, :P_ES_PROGRESO, @P_ID)}", nativeQuery = true)
	String insertar(@Param("P_ID_INSCRITO") int P_ID_INSCRITO, @Param("P_ID_RECURSO") int P_ID_RECURSO,
			@Param("P_ES_PROGRESO") int P_ES_PROGRESO);

	// ELIMINAR
	@Query(value = "{call SP_DEL_TBL_PROGRESO(:P_ID)}", nativeQuery = true)
	String eliminar(@Param("P_ID") int P_ID);

	// ACTULALIZAR
	@Query(value = "{CALL SP_UPD_TBL_PROGRESO (:P_ID_PROGRESO, :P_ID_INSCRITO, :P_ID_RECURSO, "
			+ ":P_ES_PROGRESO, @P_OK)}", nativeQuery = true)
	String actualizar(@Param("P_ID_PROGRESO") int P_ID_PROGRESO, @Param("P_ID_INSCRITO") int P_ID_INSCRITO,
			@Param("P_ID_RECURSO") int P_ID_RECURSO, @Param("P_ES_PROGRESO") int P_ES_PROGRESO);
}
