package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.TipoRecurso;

@Repository
public interface TipoRecursoRepository extends JpaRepository<TipoRecurso, Integer>{

}
