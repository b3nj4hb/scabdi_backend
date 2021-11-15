package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Area;

public interface AreaService {

	List<Area> readAll();

	Area create(Area al);

	Area read(int id);

	void delete(int id);

	Area update(Area al);
	
}
