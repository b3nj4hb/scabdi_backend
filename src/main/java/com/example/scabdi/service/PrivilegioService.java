package com.example.scabdi.service;
import java.util.List;
import java.util.Map;

import com.example.scabdi.entity.Privilegio;


public interface PrivilegioService {
	List<Privilegio> readAll();
	Privilegio create(Privilegio pv);
	Privilegio read(int id);
	void delete(int id);
	Privilegio update(Privilegio pv);
	//List<Map<String,Object>> listarprivilegios();
}
