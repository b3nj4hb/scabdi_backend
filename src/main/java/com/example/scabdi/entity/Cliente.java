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
@Table(name="cliente")
public class Cliente implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcliente")
	private int id;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="idventa")
	private Set<Venta> ventas;
	private static final long serialVersionUID = 1L;
	

}
