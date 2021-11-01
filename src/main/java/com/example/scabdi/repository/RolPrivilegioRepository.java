package com.example.scabdi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.scabdi.entity.RolPrivilegio;

public interface RolPrivilegioRepository extends JpaRepository<RolPrivilegio, Integer> {

	// LISTAR
	@Query(value = "{call SP_LISTA_TSG_ROL_PRIVILEGIO()}", nativeQuery = true)
	List<RolPrivilegio> listar();

	// BUSCAR
	@Query(value = "{call SP_BUSCAR_TSG_ROL_PRIVILEGIO(:P_ID)}", nativeQuery = true)
	Optional<RolPrivilegio> buscar(@Param("P_ID") int P_ID);

	// INSERTAR
	@Query(value = "{call SP_INS_TSG_ROL_PRIVILEGIO" + "(:p_nID_ROL, :p_nID_PRIVILEGIO, @P_ID)}", nativeQuery = true)
	String insertar(@Param("p_nID_ROL") int p_nID_ROL, @Param("p_nID_PRIVILEGIO") int p_nID_PRIVILEGIO);

	// ELIMINAR
	@Query(value = "{call SP_DEL_TSG_ROL_PRIVILEGIO(:P_ID)}", nativeQuery = true)
	String eliminar(@Param("P_ID") int P_ID);

	// ACTUALIZAR
	@Query(value = "{CALL SP_UPD_TSG_ROL_PRIVILEGIO"
			+ "(:P_ID, :P_ID_ROL, :P_ID_PRIVILEGIO, @P_OK)}", nativeQuery = true)
	String actualizar(@Param("P_ID") int P_ID, @Param("P_ID_ROL") int P_ID_ROL,
			@Param("P_ID_PRIVILEGIO") int P_ID_PRIVILEGIO);

}
