package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.DetalleVenta;
@Repository
public interface DetalleVentaRepositoy extends JpaRepository<DetalleVenta, Integer>{

}
