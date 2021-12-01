package com.example.scabdi.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Sesion;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Integer>{
	@Query(value = "select r.no_recurso, s.no_sesion from tbl_recurso r\r\n"
			+ "	join tbl_sesion s on r.id_sesion = s.id_sesion\r\n"
			+ "	where r.id_sesion = ?", nativeQuery = true)
 	List<Map<String,Object>> listarecurso(int id);
}
