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
@Table(name = "tbl_valoracion")

public class Valoracion implements Serializable {

	private static final long serialVersionUID = -5136116338269561288L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_valoracion")
	private int id;

	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_inscrito", referencedColumnName = "id_inscrito")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Inscrito id_inscrito;

	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_sesion", referencedColumnName = "id_sesion")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Sesion id_sesion;

	@Column(name = "nu_puntuacion")
	private String puntuacion;

}
