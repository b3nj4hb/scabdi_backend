package com.example.scabdi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Modulo;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Integer>{
	    //LISTAR
		@Query(value = "{call SP_LISTA_TBL_MODULO()}", nativeQuery = true) 
		List<Modulo> listamodulos();
		//BUSCAR
		@Query(value = "{call SP_BUSCAR_TBL_MODULO(:p_nID_MODULO)}", nativeQuery = true)
		Optional<Modulo> buscar(@Param("p_nID_MODULO") int p_nID_MODULO);
		// INSERTAR
	    @Query(value = "{call SP_INS_TBL_MODULO(:p_nID_AREA ,:p_vNO_MODULO,:p_vDE_MODULO,:p_nCA_TOTAL_RECURSOS ,@p_nID_MODULO)}", nativeQuery = true)
	    String insertar(@Param("p_nID_AREA") int p_nID_AREA, @Param("p_vNO_MODULO") String p_vNO_MODULO, @Param("p_vDE_MODULO") String p_vDE_MODULO, @Param("p_nCA_TOTAL_RECURSOS") int p_nCA_TOTAL_RECURSOS);
	    // ELIMINAR
	 	@Query(value = "{call SP_DEL_TBL_MODULO(:p_nID_MODULO)}", nativeQuery = true)
	 	String eliminar(@Param("p_nID_MODULO") int p_nID_MODULO);
	    // ACTULALIZAR
	 	@Query(value = "{CALL SP_UPD_TBL_MODULO(:p_nID_MODULO,:p_nID_AREA,:p_vNO_MODULO,:p_vDE_MODULO,:p_nCA_TOTAL_RECURSOS, @P_OK)}", nativeQuery = true)
	 	String actualizar(@Param("p_nID_MODULO") int p_nID_MODULO, @Param("p_nID_AREA") int p_nID_AREA,@Param("p_vNO_MODULO") String p_vNO_MODULO, @Param("p_vDE_MODULO") String p_vDE_MODULO, @Param("p_nCA_TOTAL_RECURSOS") int p_nCA_TOTAL_RECURSOS);
}
