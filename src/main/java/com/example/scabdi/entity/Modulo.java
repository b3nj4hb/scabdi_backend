package com.example.scabdi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TBL_MODULO")
public class Modulo {
@Id
@Column(name = "ID_MODULO")
private int id_modulo;
@Column(name = "NO_MODULO")
private String no_modulo;
@Column(name = "DE_MODULO")
private String de_modulo;
@Column(name = "CA_TOTAL_RECURSOS")
private int ca_total_recursos;
@Column(name = "ID_AREA")
private int id_area;

}
