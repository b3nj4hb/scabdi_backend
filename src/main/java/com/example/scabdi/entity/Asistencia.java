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
@Table(name = "tbl_asistencia")

public class Asistencia implements Serializable {

	private static final long serialVersionUID = 3547524531124270115L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_asistencia")
	private int id;

	@Column(name = "id_persona")
	private int id_persona;

	@Column(name = "id_conferencia")
	private int id_conferencia;

	@Column(name = "de_comentario")
	private String descripcion;

	// @OneToOne(mappedBy = "TBL_PERSONA")

}
