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
@Table(name = "producto")
public class Producto implements Serializable{

	private static final long serialVersionUID = 3754851399214200439L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproducto")
	private int id;
	@Column(name = "nom_producto")
	private String nombre;
	private double precio;
	private int stock;
	@ManyToOne
	@JoinColumn(name="idcategoria", nullable = false)
	private Categoria categoria;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="iddetalle_venta")
	private Set<DetalleVenta> detalles;

}
