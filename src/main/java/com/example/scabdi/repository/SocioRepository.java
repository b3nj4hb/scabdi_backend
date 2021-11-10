package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Integer>{

}
