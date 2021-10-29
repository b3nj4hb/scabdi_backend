package com.example.scabdi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBL = BANCO_COMUNAL")
public class Banco_modulo {
    @Id
    @Column(name = "ID_BANCO_COMUNAL")
    private int id_banco_modulo;
    @Column(name = "ID_SEDE")
    private int id_sede;
    @Column(name = "NO_BANCO_COMUNAL")
    private String no_banco_comunal;
    @Column(name = "ES_BANCO_COMUNAL")
    private String es_banco_comunal;
}
