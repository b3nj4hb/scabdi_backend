package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Privilegio;

@Repository
public interface PrivilegioRepository extends JpaRepository<Privilegio, Integer>{

}
