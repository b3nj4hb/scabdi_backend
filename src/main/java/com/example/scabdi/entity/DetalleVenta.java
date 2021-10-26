package com.example.scabdi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_venta")
public class DetalleVenta implements Serializable {

	private static final long serialVersionUID = -9062936564953879252L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddetalle_venta")
	private int id;
	@Column(name = "precio_venta")
	private double precio;
	@Column(name = "cantidad_venta")
	private int cantidad;
	@ManyToOne
	@JoinColumn(name="idproducto", nullable = false)
	private Producto producto;
	@ManyToOne
	@JoinColumn(name="idventa", nullable = false)
	private Venta venta;

}
