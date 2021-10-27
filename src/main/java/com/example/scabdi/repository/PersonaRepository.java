package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.scabdi.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
