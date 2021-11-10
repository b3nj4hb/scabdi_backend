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
@Table(name = "TBL_PROGRESO")

public class Progreso implements Serializable {

	private static final long serialVersionUID = -3942066400466258264L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROGRESO")
	private int id;

	@Column(name = "ID_INSCRITO")
	private int id_inscrito;

	@Column(name = "ID_RECURSO")
	private int id_recurso;

	@Column(name = "ES_PROGRESO")
	private int es_progreso;

}
