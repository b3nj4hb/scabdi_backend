package com.example.scabdi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "TBL_BANCO_MODULO")
public class Banco_Modulo {
@Id
@Column(name = "ID_BANCO_MODULO")
private int id_banco_modulo;
@Column(name = "ID_BANCO_COMUNAL")
private int id_banco_comunal;
@Column(name = "ID_MODULO")
private int id_modulo;
}
