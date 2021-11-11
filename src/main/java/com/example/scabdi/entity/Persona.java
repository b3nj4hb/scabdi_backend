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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBL_PERSONA")

public class Persona implements Serializable {

	private static final long serialVersionUID = -1745994231778055557L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PERSONA")
	private int id;

	@Column(name = "NO_PERSONA")
	private String nombre;

	@Column(name = "AP_PERSONA")
	private String apellido;

	@Column(name = "NU_DNI")
	private String dni;

	@Column(name = "EM_CORREO")
	private String correo;

	@Column(name = "NU_TELEFONO")
	private String telefono;

	//Relaciones
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_persona")
	@JsonIgnore
	private Usuario usuario;
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_persona")
	@JsonIgnore
	private List<Prueba> prueba = new ArrayList<>();
	
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_persona")
	@JsonIgnore
	private Socio socio;

}
