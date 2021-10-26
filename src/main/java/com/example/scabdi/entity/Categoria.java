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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
	private static final long serialVersionUID = -1942395296462336245L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcategoria")
	private int id;
	@Column(name= "nom_cat")
	private String nomcat;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="idproducto")
	private Set<Producto> productos;
	
}
