package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Pedido;
import com.example.scabdi.repository.PedidoRepository;
import com.example.scabdi.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

	@Autowired
	private PedidoRepository repo;
	
	@Override
	public List<Pedido> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Pedido create(Pedido al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Pedido read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Pedido update(Pedido al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

}
