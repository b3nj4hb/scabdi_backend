package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
