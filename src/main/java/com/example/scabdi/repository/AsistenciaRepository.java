package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Asistencia;

@Repository
public interface AsistenciaRepository extends JpaRepository<Asistencia, Integer>{

}
