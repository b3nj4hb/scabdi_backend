package com.example.scabdi.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="venta")
public class Venta implements Serializable{/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idventa")
	private int id;
	@ManyToOne
	@JoinColumn(name="idusuario", nullable = false)
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name="idcliente", nullable = false)
	private Cliente cliente;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="iddetalle_venta")
	private Set<DetalleVenta> detalles;
	private static final long serialVersionUID = 6783822574632571860L;

}
