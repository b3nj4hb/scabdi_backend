package com.example.scabdi.entity;


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
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_banco_comunal" )

public class BancoComunal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_banco_comunal")
	public int id_bancocomunal;
	
	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_sede", referencedColumnName = "id_sede")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Sede id_sede;
	
	@Column(name = "no_banco_comunal")
	public String no_bancocomunal;
	
	@Column(name = "es_banco_comunal")
	public int es_bancocomunal;
	
	//Relaciones
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_banco")
	@JsonIgnore
	private List<Socio> socio = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_banco")
	@JsonIgnore
	private List<BancoModulo> bancoModulo = new ArrayList<>();
	
}
