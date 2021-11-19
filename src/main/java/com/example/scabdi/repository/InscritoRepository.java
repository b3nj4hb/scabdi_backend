package com.example.scabdi.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.scabdi.entity.Inscrito;
@Repository
public interface InscritoRepository extends JpaRepository<Inscrito, Integer>{
	//LISTAR
	@Query(value = "{call SP_LISTA_TBL_INSCRITO()}", nativeQuery = true) 
	List<Inscrito> listainscritos();
//BUSCAR
	@Query(value = "{call SP_BUSCAR_TBL_INSCRITO(:p_nID_INSCRITO)}", nativeQuery = true)
	Optional<Inscrito> buscar(@Param("p_nID_INSCRITO") int p_nID_INSCRITO);
// INSERTAR
    @Query(value = "{call SP_INS_TBL_INSCRITO(:p_nID_PERSONA,:p_nID_MODULO,:p_dFE_INSCRIPCION,:p_nID_RECURSOS_VISTOS, @p_nID_INSCRITO)}", nativeQuery = true)
    String insertar(@Param("p_nID_PERSONA") int p_nID_PERSONA,@Param("p_nID_MODULO") int p_nID_MODULO,@Param("p_dFE_INSCRIPCION") String p_dFE_INSCRIPCION,@Param("p_nID_RECURSOS_VISTOS") int p_nID_RECURSOS_VISTOS);	
// ELIMINAR
 	@Query(value = "{call SP_DEL_TBL_INSCRITO(:p_nID_INSCRITO)}", nativeQuery = true)
 	String eliminar(@Param("p_nID_INSCRITO") int p_nID_INSCRITO);
// ACTULALIZAR
 	@Query(value = "{CALL SP_UPD_TBL_INSCRITO(:p_nID_INSCRITO, :p_nID_PERSONA,:p_nID_MODULO,:p_dFE_INSCRIPCION ,:p_nCA_RECURSOS_VISTOS, @P_OK)}", nativeQuery = true)
 	String actualizar(@Param("p_nID_INSCRITO") int p_nID_INSCRITO, @Param("p_nID_PERSONA") int p_nID_PERSONA,@Param("p_nID_MODULO") int p_nID_MODULO,@Param("p_dFE_INSCRIPCION") String p_dFE_INSCRIPCION,@Param("p_nCA_RECURSOS_VISTOS") int p_nCA_RECURSOS_VISTOS);
}

