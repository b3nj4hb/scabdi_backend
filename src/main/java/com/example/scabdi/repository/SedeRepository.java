package com.example.scabdi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Sede;

@Repository
public interface SedeRepository extends JpaRepository<Sede, Integer>{

	
	@Query(value = "{call SP_LISTA_TBL_SEDE()}", nativeQuery = true) 
	List<Sede> listaSedes();
	
	@Query(value = "{call SP_BUSCAR_TBL_SEDE(:p_nID_SEDE)}", nativeQuery = true) 
	Optional<Sede> readId(@Param("p_nID_SEDE") int V_ID);
	
	
	@Query(value = "{call SP_INS_TBL_SEDE"
			+ "(:p_vNO_SEDE, :p_nES_SEDE, @p_nID_SEDE)}", nativeQuery = true) 
	String saveSede(@Param("p_vNO_SEDE") String P_NO_SEDE,
			@Param("p_nES_SEDE") int P_ES_SEDE);
	/*
	@Query(value="Alter table TBL_SEDE auto_increment = 0", nativeQuery=true)
	String reiniciarAutoIncrement();
	*/
	@Query(value="{call SP_DEL_TBL_SEDE(:p_nID_SEDE)}", nativeQuery = true)
	String eliminarSede(@Param("p_nID_SEDE") int P_ID_SEDE);
}
