package com.example.scabdi.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Integer>{

	@Query(value = "select ts2.ID_PERSONA idsocio, concat(tp.NO_PERSONA,' ',tp.AP_PERSONA) socio, \r\n"
			+ "tbc.NO_BANCO_COMUNAL banco, ts.NO_SEDE sede\r\n"
			+ "from tbl_sede ts\r\n"
			+ "join tbl_banco_comunal tbc on ts.ID_SEDE = tbc.ID_BANCO_COMUNAL \r\n"
			+ "join tbl_socio ts2 on tbc.ID_BANCO_COMUNAL = ts2.ID_BANCO_COMUNAL \r\n"
			+ "join tbl_persona tp on ts2.ID_PERSONA = tp.ID_PERSONA \r\n"
			+ "order by tp.NO_PERSONA", nativeQuery = true)
	List<Map<String,Object>> socio();
	
	@Query(value = "select concat(tp.NO_PERSONA,' ',tp.AP_PERSONA) socio, \r\n"
			+ "tp.NU_DNI dni, tp.EM_CORREO correo, tp.NU_TELEFONO cel, \r\n"
			+ "tbc.NO_BANCO_COMUNAL banco, ts.NO_SEDE sede\r\n"
			+ "from tbl_sede ts \r\n"
			+ "join tbl_banco_comunal tbc on ts.ID_SEDE = tbc.ID_SEDE \r\n"
			+ "join tbl_socio ts2 on tbc.ID_BANCO_COMUNAL = ts2.ID_BANCO_COMUNAL \r\n"
			+ "join tbl_persona tp on ts2.ID_PERSONA = tp.ID_PERSONA \r\n"
			+ "where ts2.ID_PERSONA = ?", nativeQuery = true)
	List<Map<String,Object>> datos(int id);
	
	@Query(value = "select tm.NO_MODULO modulo\r\n"
			+ "from tbl_socio s \r\n"
			+ "join tbl_banco_comunal tbc on s.ID_BANCO_COMUNAL = tbc.ID_BANCO_COMUNAL \r\n"
			+ "join tbl_banco_modulo tbm on tbc.ID_BANCO_COMUNAL = tbm.ID_BANCO_COMUNAL\r\n"
			+ "join tbl_modulo tm on tbm.ID_MODULO = tm.ID_MODULO\r\n"
			+ "where s.ID_PERSONA = ? order by tm.NO_MODULO", nativeQuery = true)
	List<Map<String,Object>> modulos(int id);
	
	@Query(value = "select tp.DE_PEDIDO pedido, tp.FE_PEDIDO fecha\r\n"
			+ "from tbl_pedido tp \r\n"
			+ "join tbl_socio ts on tp.ID_PERSONA = ts.ID_PERSONA\r\n"
			+ "join tbl_persona tp2 on ts.ID_PERSONA = tp2.ID_PERSONA\r\n"
			+ "where ts.ID_PERSONA = ?\r\n"
			+ "order by FE_PEDIDO desc", nativeQuery = true)
	List<Map<String,Object>> pedidos(int id);
}
