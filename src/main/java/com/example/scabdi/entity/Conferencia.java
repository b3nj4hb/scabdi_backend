package com.example.scabdi.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_conferencia")

public class Conferencia implements Serializable {

	private static final long serialVersionUID = -6386438241193095886L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conferencia")
	private int id;

	@Column(name = "no_conferencia")
	private String nombre;

	@Column(name = "fe_inicio")
	private String inicio;

	@Column(name = "fe_fin")
	private String fin;

	@Column(name = "url_conferencia")
	private String url;

	//Relaciones
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_conferencia")
	@JsonIgnore
	private List<Asistencia> asistencia = new ArrayList<>();

}
