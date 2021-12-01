package com.example.scabdi.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Privilegio;


@Repository
public interface PrivilegioRepository extends JpaRepository<Privilegio, Integer>{
	//LISTAR
			@Query(value = "{CALL SP_LISTA_TSG_PRIVILEGIO()}", nativeQuery = true) 
			List<Privilegio> listaprivilegios();
			//BUSCAR
			@Query(value = "{call SP_BUSCAR_TSG_PRIVILEGIO(:p_nID_PRIVILEGIO)}", nativeQuery = true)
			Optional<Privilegio> buscar(@Param("p_nID_PRIVILEGIO") int p_nID_PRIVILEGIO);
			// INSERTAR
		    @Query(value = "{call SP_INS_TSG_PRIVILEGIO (:p_vNO_PRIVILEGIO, @p_nID_PRIVILEGIO)}", nativeQuery = true)
		    String insertar(@Param("p_vNO_PRIVILEGIO") String p_vNO_PRIVILEGIO);
		    // ELIMINAR
		 	@Query(value = "{call SP_DEL_TSG_PRIVILEGIO(:p_nID_PRIVILEGIO)}", nativeQuery = true)
		 	String eliminar(@Param("p_nID_PRIVILEGIO") int p_nID_PRIVILEGIO);
		    // ACTULALIZAR
		 	@Query(value = "{CALL SP_UPD_TSG_PRIVILEGIO (:p_nID_PRIVILEGIO, :p_vNO_PRIVILEGIO, @P_OK)}", nativeQuery = true)
		 	String actualizar(@Param("p_nID_PRIVILEGIO") int p_nID_PRIVILEGIO, @Param("p_vNO_PRIVILEGIO") String p_vNO_PRIVILEGIO);// lista del tipo del DTO generado
			
		 	/*@Query(value = "select p.no_persona persona, c.no_conferencia seminario,"
		 			+ "a.de_comentario comentario, v.nu_puntuacion puntuacion,"
		 			+ "bc.NO_BANCO_COMUNAL banco, se.NO_SEDE sede"
		 			+ "from tbl_asistencia a"
		 			+ "join tbl_conferencia c on a.ID_CONFERENCIA = c.ID_CONFERENCIA"
		 			+ "join tbl_socio s on a.ID_PERSONA = s.ID_PERSONA"
		 			+ "join tbl_inscrito i on s.ID_PERSONA = i.ID_PERSONA"
		 			+ "join tbl_valoracion v on i.ID_INSCRITO = v.ID_INSCRITO"
		 			+ "join tbl_persona p on s.ID_PERSONA = p.ID_PERSONA"
		 			+ "join tbl_banco_comunal bc on s.ID_BANCO_COMUNAL = bc.ID_BANCO_COMUNAL"
		 			+ "join tbl_sede se on bc.id_sede = se.ID_SEDE"
		 			+ "where c.id_conferencia = ?")
		 	List<Map<String,Object>> listarprivilegios();*/
		 	
}
