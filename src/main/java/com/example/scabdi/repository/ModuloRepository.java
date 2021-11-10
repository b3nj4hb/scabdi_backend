package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Modulo;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Integer>{

}
