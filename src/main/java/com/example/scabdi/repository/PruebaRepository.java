package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Prueba;

@Repository
public interface PruebaRepository extends JpaRepository<Prueba, Integer>{

}
