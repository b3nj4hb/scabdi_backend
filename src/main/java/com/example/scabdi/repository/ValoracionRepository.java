package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Valoracion;

@Repository
public interface ValoracionRepository extends JpaRepository<Valoracion, Integer>{

}
