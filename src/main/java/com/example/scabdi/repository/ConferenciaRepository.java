package com.example.scabdi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Conferencia;

@Repository
public interface ConferenciaRepository extends JpaRepository<Conferencia, Integer>{

}
