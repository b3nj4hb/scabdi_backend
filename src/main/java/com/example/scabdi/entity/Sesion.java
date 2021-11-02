package com.example.scabdi.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBL_SESION")

public class Sesion implements Serializable {

	private static final long serialVersionUID = -6638137602792411742L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SESION")
	private int id;

	@Column(name = "NO_SESION")
	private String no_sesion;

	@ManyToOne
	@JoinColumn(name = "ID_MODULO", nullable = false)
	private Tipo_recurso id_modulo;

	@Column(name = "FE_INICIO_SESION")
	private String fe_inicio_sesion;
	
	@Column(name = "FE_FIN_SESION")
	private String fe_fin_sesion;
	
	//RELACIONES
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="ID_RECURSO")
	private Set<Recurso> recurso;
	
}
