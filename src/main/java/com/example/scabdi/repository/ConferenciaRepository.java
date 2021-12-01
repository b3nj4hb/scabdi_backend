package com.example.scabdi.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Conferencia;

@Repository
public interface ConferenciaRepository extends JpaRepository<Conferencia, Integer> {

	@Query(value = "{call SP_DIGI2(:v_id)}", nativeQuery = true)
	/*Optional<Modulo> buscar(@Param("p_nID_MODULO") int p_nID_MODULO);*/
	List<Map<String,Object>> digi(@Param("v_id")int id);
}