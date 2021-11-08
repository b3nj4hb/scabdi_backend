package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.scabdi.entity.Pedido;
import com.google.common.base.Optional;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	//LISTAR
			@Query(value = "{call SP_LISTA_TBL_PEDIDO()}", nativeQuery = true) 
			List<Pedido> listarpedido();
	//BUSCAR
			@Query(value = "{call SP_BUSCAR_TBL_PEDIDO(:P_ID)}", nativeQuery = true)
			Optional<Pedido> buscar(@Param("P_ID") int P_ID);		
	// INSERTAR
			@Query(value = "{call SP_INS_TBL_PEDIDO" + "(:P_ID_PERSONA, :P_DE_PEDIDO, :P_FE_PEDIDO)}", nativeQuery = true)
			String insertar(@Param("P_ID_PERSONA") int P_ID_PERSONA, 
					        @Param("P_DE_PEDIDO") String P_DE_PEDIDO, 
					        @Param("P_FE_PEDIDO") String P_FE_PEDIDO);		
    // ELIMINAR
			@Query(value = "{call SP_DEL_TBL_PEDIDO(:P_ID)}", nativeQuery = true)
			String eliminar(@Param("P_ID") int P_ID);		
    // ACTULALIZAR
			@Query(value = "{CALL SP_UPD_TBL_PEDIDO" + "(:P_ID, :P_DE_PEDIDO)}", nativeQuery = true)
			String actualizar(@Param("P_ID") int P_ID,
					          @Param("P_DE_PEDIDO") String P_DE_PEDIDO);		
}