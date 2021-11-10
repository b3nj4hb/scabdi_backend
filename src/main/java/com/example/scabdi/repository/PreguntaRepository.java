package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Pregunta;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Integer>{

}
