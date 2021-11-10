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
@Table(name = "tbl_inscito")

public class Inscrito implements Serializable {

	private static final long serialVersionUID = 8110193873230273411L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_inscrito")
	private int id;

	@Column(name = "id_persona")
	private int id_persona;

	@Column(name = "id_modulo")
	private int id_modulo;

	@Column(name = "fe_inscripcion")
	private String fecha;

	@Column(name = "ca_recursos")
	private String recursos;

	// @OneToOne(mappedBy = "TBL_PERSONA")

}
