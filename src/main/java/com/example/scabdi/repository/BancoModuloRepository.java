package com.example.scabdi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.BancoModulo;
import com.example.scabdi.entity.Banco_Modulo;

@Repository
public interface BancoModuloRepository extends JpaRepository<BancoModulo, Integer>{
	// LISTAR
		@Query(value = "{call SP_LISTA_TBL_BANCO_MODULO()}", nativeQuery = true)
		List<Banco_Modulo> listabanco_modulos();

		// BUSCAR
		@Query(value = "{call SP_BUSCAR_TBL_BANCO_MODULO(:p_nID_BANCO_MODULO)}", nativeQuery = true)
		Optional<Banco_Modulo> buscar(@Param("p_nID_BANCO_MODULO") int p_nID_BANCO_MODULO);

		// INSERTAR
		@Query(value = "{call SP_INS_TBL_BANCO_MODULO(:p_nID_BANCO_COMUNAL,:p_nID_MODULO, @p_nID_BANCO_MODULO)}", nativeQuery = true)
		String insertar(@Param("p_nID_BANCO_COMUNAL") int p_nID_BANCO_COMUNAL, @Param("p_nID_MODULO") int p_nID_MODULO);

		// ELIMINAR
		@Query(value = "{call SP_DEL_TBL_BANCO_MODULO(:p_nID_BANCO_MODULO)}", nativeQuery = true)
		String eliminar(@Param("p_nID_BANCO_MODULO") int p_nID_BANCO_MODULO);

		// ACTULALIZAR
		@Query(value = "{CALL SP_UPD_TBL_BANCO_MODULO(:p_nID_BANCO_MODULO, :p_nID_BANCO_COMUNAL,:p_nID_MODULO, @P_OK)}", nativeQuery = true)
		String actualizar(@Param("p_nID_BANCO_MODULO") int p_nID_BANCO_MODULO, @Param("p_nID_BANCO_COMUNAL") int p_nID_BANCO_COMUNAL , @Param("p_nID_MODULO") int p_nID_MODULO );

}
