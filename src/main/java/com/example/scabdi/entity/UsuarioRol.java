package com.example.scabdi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tsg_usuario_rol")

public class UsuarioRol implements Serializable {

	private static final long serialVersionUID = -2075872038581252564L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario_rol")
	private int id;

	@Column(name = "id_persona")
	private String id_persona;

	@Column(name = "id_rol")
	private String id_rol;
	
	// @OneToOne(mappedBy = "TBL_PERSONA")

}
