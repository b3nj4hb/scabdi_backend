package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.BancoModulo;

@Repository
public interface BancoModuloRepository extends JpaRepository<BancoModulo, Integer>{

}
