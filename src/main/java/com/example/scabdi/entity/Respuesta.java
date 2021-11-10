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
@Table(name = "tbl_respuesta")

public class Respuesta implements Serializable {
	
	private static final long serialVersionUID = -6734383165445074110L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_respuesta")
	private int id;

	@Column(name = "id_pregunta")
	private int id_pregunta;

	@Column(name = "de_respuesta")
	private String descripcion;

	@Column(name = "es_respuesta")
	private String es_respuesta;

	// @OneToOne(mappedBy = "TBL_PERSONA")

}
