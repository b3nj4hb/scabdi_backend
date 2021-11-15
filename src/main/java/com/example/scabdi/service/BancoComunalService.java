package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.BancoComunal;

public interface BancoComunalService {

	List<BancoComunal> readAll();

	BancoComunal create(BancoComunal al);

	BancoComunal read(int id);

	void delete(int id);

	BancoComunal update(BancoComunal al);
	
}
