package com.example.scabdi.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4144737958266697579L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario")
	private int id;
	private String username;
	private String password;
	private int estado;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idempleado", referencedColumnName = "idempleado")
	private Empleado empleado;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "usuario_rol", 
	joinColumns = {@JoinColumn(name = "idusuario")}, 
	inverseJoinColumns = {@JoinColumn(name = "idrol")})
	private List<Rol> roles = new ArrayList<>();

}
