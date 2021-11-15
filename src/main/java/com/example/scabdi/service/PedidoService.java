package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Pedido;

public interface PedidoService {

	List<Pedido> readAll();

	Pedido create(Pedido al);

	Pedido read(int id);

	void delete(int id);

	Pedido update(Pedido al);
	
}
