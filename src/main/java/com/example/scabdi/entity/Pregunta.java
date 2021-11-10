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
@Table(name = "tbl_pregunta")

public class Pregunta implements Serializable {

	private static final long serialVersionUID = 6995987402715295305L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pregunta")
	private int id;

	@Column(name = "de_pregunta")
	private String descripcion;

	@Column(name = "in_orden")
	private String orden;

	@Column(name = "id_recurso")
	private String id_recurso;

	// @OneToOne(mappedBy = "TBL_PERSONA")

}
