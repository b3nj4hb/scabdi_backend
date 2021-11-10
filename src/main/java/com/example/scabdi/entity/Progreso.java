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
@Table(name = "TBL_PROGRESO")

public class Progreso implements Serializable {

	private static final long serialVersionUID = -3942066400466258264L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROGRESO")
	private int id;

	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_inscrito", referencedColumnName = "id_inscrito")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Inscrito id_inscrito;

	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_recurso", referencedColumnName = "id_recurso")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Recurso id_recurso;

	@Column(name = "ES_PROGRESO")
	private int es_progreso;

}
