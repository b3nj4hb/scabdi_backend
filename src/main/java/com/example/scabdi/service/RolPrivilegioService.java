package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.RolPrivilegio;

public interface RolPrivilegioService {

	List<RolPrivilegio> readAll();

	RolPrivilegio create(RolPrivilegio al);

	RolPrivilegio read(int id);

	void delete(int id);

	RolPrivilegio update(RolPrivilegio al);
	
	
}
