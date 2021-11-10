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
@Table(name = "tbl_valoracion")

public class Valoracion implements Serializable {

	private static final long serialVersionUID = -5136116338269561288L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_valoracion")
	private int id;

	@Column(name = "id_inscrito")
	private int id_incrito;

	@Column(name = "id_sesion")
	private int id_sesion;

	@Column(name = "nu_puntuacion")
	private String puntuacion;

	// @OneToOne(mappedBy = "TBL_PERSONA")

}
