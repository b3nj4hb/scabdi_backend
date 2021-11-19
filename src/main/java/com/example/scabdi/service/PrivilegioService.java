package com.example.scabdi.service;
import java.util.List;
import com.example.scabdi.entity.Privilegio;


public interface PrivilegioService {
	List<Privilegio> readAll();
	Privilegio create(Privilegio pv);
	Privilegio read(int id);
	void delete(int id);
	Privilegio update(Privilegio pv);
}
