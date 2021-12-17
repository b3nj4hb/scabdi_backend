package com.example.scabdi.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Sesion;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Integer> {

	@Query(value = "select s.id_sesion id, s.no_sesion nombre, m.no_modulo modulo, a.no_area area, s.fe_inicio_sesion inicio, s.fe_fin_sesion fin\r\n"
			+ "from tbl_sesion s\r\n" + "join tbl_modulo m on s.id_modulo = m.id_modulo\r\n"
			+ "join tbl_area a on m.id_area = a.id_area", nativeQuery = true)
	List<Map<String, Object>> listarsesion();

	@Query(value = "select r.no_recurso nombre, tr.no_tipo_recurso tipo, r.url_recurso url \r\n"
			+ "from tbl_recurso r \r\n" + "join tbl_tipo_recurso tr on r.id_tipo_recurso = tr.id_tipo_recurso\r\n"
			+ "where id_sesion = ?", nativeQuery = true)
	List<Map<String, Object>> listarrecurso(int id);

	// recibe id sesion
	@Query(value = "select r.no_recurso, s.no_sesion, r.url_recurso from tbl_recurso r\r\n"
			+ "	join tbl_sesion s on r.id_sesion = s.id_sesion\r\n" + "	where r.id_sesion = ?", nativeQuery = true)
	List<Map<String, Object>> listarecurso(int id);

	// manda id sesion
	@Query(value = "select concat(tp.NO_PERSONA,', ',tp.AP_PERSONA)persona, ts3.NO_SESION sesion, \r\n"
			+ "ts3.FE_INICIO_SESION inicio, ts3.FE_FIN_SESION fin, ts3.ID_SESION idsesion,\r\n"
			+ "tm.NO_MODULO modulo, ts2.NO_SEDE sede\r\n"
			+ "from tbl_banco_comunal tbc \r\n"
			+ "join tbl_socio ts on tbc.ID_BANCO_COMUNAL = ts.ID_BANCO_COMUNAL \r\n"
			+ "join tbl_sede ts2 on tbc.ID_SEDE = ts2.ID_SEDE \r\n"
			+ "join tbl_persona tp on ts.ID_PERSONA = tp.ID_PERSONA \r\n"
			+ "join tbl_banco_modulo tbm on tbc.ID_BANCO_COMUNAL = tbm.ID_MODULO \r\n"
			+ "join tbl_modulo tm on tbm.ID_MODULO = tm.ID_MODULO \r\n"
			+ "join tbl_sesion ts3 on tm.ID_MODULO = ts3.ID_MODULO \r\n"
			+ "where tp.ID_PERSONA = ?\r\n"
			+ "and ts3.FE_INICIO_SESION >= concat(EXTRACT(year FROM now()),'-',EXTRACT(MONTH FROM now()),'-0 ','00:00:00')\r\n"
			+ "and ts3.FE_FIN_SESION <= date_add(now(),interval 1 month)\r\n"
			+ "order by FE_INICIO_SESION desc limit 1", nativeQuery = true)
	List<Map<String, Object>> sesionactiva(int id);
}
