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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "tbl_recurso")

public class Recurso implements Serializable {

	private static final long serialVersionUID = 319819275701613594L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_RECURSO")
	private int id;

	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_sesion", referencedColumnName = "id_sesion")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Sesion id_sesion;
	
	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_tipo_recurso", referencedColumnName = "id_tipo_recurso")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private TipoRecurso id_tipo;
	
	@Column(name = "NO_RECURSO")
	private String nombre;

	@Column(name = "FI_RECURSO")
	private String file;

	@Column(name = "URL_RECURSO")
	private String url;
	
	//Relaciones
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_recurso")
	@JsonIgnore
	private List<Pregunta> pregunta = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_recurso")
	@JsonIgnore
	private List<Progreso> progreso = new ArrayList<>();
}
