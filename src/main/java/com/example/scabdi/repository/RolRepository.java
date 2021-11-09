package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{

}
