package com.example.scabdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scabdi.entity.BancoComunal;

@Repository
public interface BancoComunalRepository extends JpaRepository<BancoComunal, Integer>{

}
