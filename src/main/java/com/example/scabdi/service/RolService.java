package com.example.scabdi.service;

import java.util.List;

import com.example.scabdi.entity.Rol;

public interface RolService {
List<Rol> readAll();
Rol create(Rol rl);
Rol read(int id);
void delete(int id);
Rol update(Rol rl);
}
