package com.example.scabdi.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_pregunta", referencedColumnName = "id_pregunta")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Pregunta id_pregunta;

	@Column(name = "de_respuesta")
	private String descripcion;

	@Column(name = "es_respuesta")
	private int estado;

}
