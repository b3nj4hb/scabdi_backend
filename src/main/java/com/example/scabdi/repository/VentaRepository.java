package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.Venta;
@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer>{

}
