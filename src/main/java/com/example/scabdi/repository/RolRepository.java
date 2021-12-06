package com.example.scabdi.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Rol;


@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    //LISTAR
	@Query(value = "{call SP_LISTA_TSG_ROL()}", nativeQuery = true) 
	List<Rol> listaRoles();
	//BUSCAR
	@Query(value = "{call SP_BUSCAR_TSG_ROL(:p_nID_ROL)}", nativeQuery = true)
	Optional<Rol> buscar(@Param("p_nID_ROL") int p_nID_ROL);
	// INSERTAR
    @Query(value = "{call SP_INS_TSG_ROL (:p_vNO_ROL, @p_nID_ROL)}", nativeQuery = true)
    String insertar(@Param("p_vNO_ROL") String p_vNO_ROL);
    // ELIMINAR
 	@Query(value = "{call SP_DEL_TSG_ROL(:p_nID_ROL)}", nativeQuery = true)
 	String eliminar(@Param("p_nID_ROL") int p_nID_ROL);
    // ACTULALIZAR
 	@Query(value = "{CALL SP_UPD_TSG_ROL (:p_nID_ROL, :p_vNO_ROL, @P_OK)}", nativeQuery = true)
 	String actualizar(@Param("p_nID_ROL") int p_nID_ROL, @Param("p_vNO_ROL") String p_vNO_ROL);
 	
 	@Query(value = " select r.id_rol, r.no_rol\r\n"
 			+ "from tsg_usuario u\r\n"
 			+ "join tsg_usuario_rol ur on u.id_persona = ur.id_persona\r\n"
 			+ "join tsg_rol r on ur.id_rol = r.id_rol\r\n"
 			+ "where u.id_persona = ?", nativeQuery = true)
	List<Rol> listarRoles(int id);
}







