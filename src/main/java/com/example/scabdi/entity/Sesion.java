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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
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

	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_modulo", referencedColumnName = "id_modulo")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Modulo id_modulo;

	@Column(name = "FE_INICIO_SESION")
	private String fe_inicio_sesion;
	
	@Column(name = "FE_FIN_SESION")
	private String fe_fin_sesion;
	
	//RELACIONES
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_sesion")
	@JsonIgnore
	private List<Recurso> recurso = new ArrayList<>();
	
}
