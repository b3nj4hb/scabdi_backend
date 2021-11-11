package com.example.scabdi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scabdi.entity.Area;
import com.example.scabdi.repository.AreaRepository;
import com.example.scabdi.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaRepository areaRepository;
	
	@Override
	public List<Area> readAll() {
		// TODO Auto-generated method stub
		return areaRepository.findAll();
	}

	@Override
	public Area create(Area al) {
		// TODO Auto-generated method stub
		return areaRepository.save(al);
	}

	@Override
	public Area read(int id) {
		// TODO Auto-generated method stub
		return areaRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		areaRepository.deleteById(id);
	}

	@Override
	public Area update(Area al) {
		// TODO Auto-generated method stub
		return areaRepository.save(al);
	}

}
