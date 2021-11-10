package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Inscrito;

@Repository
public interface InscritoRepository extends JpaRepository<Inscrito, Integer>{

}
