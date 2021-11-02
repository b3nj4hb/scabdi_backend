package com.example.scabdi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBL_SOCIO")
public class Socio {
	@Column(name = "ID_PERSONA")
	private int id_p;
	@Column(name = "ID_BANCO_COMUNAL")
	private int id_b;

}