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
@Table(name = "tbl_modulo")

public class Modulo implements Serializable {
	
	private static final long serialVersionUID = -573681505674342614L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MODULO")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_area", referencedColumnName = "id_area")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Area area;
	
	@Column(name = "NO_MODULO")
	private String nombre;
	
	@Column(name = "DE_MODULO")
	private String descripcion;

	@Column(name = "CA_TOTAL_RECURSOS")
	private String recursos;
	
	//RELACIONES
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_modulo")
	@JsonIgnore
	private List<Sesion> sesion = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_modulo")
	@JsonIgnore
	private List<Inscrito> inscrito = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_modulo")
	@JsonIgnore
	private List<BancoModulo> bancoModulo = new ArrayList<>();
}
