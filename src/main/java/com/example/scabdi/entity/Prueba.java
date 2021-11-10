package com.example.scabdi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_prueba")

public class Prueba implements Serializable {

	private static final long serialVersionUID = 4090963632238823268L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prueba")
	private int id;

	@Column(name = "no_prueba")
	private String nombre;

	@Column(name = "id_persona")
	private String id_persona;

	@Column(name = "de_prueba")
	private String descripcion;

	@Column(name = "fe_prueba")
	private String fecha;

	// @OneToOne(mappedBy = "TBL_PERSONA")

}