package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Sesion;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Integer>{

}
