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
@Table(name = "TBL_PERSONA")

public class BancoModulo implements Serializable {

	private static final long serialVersionUID = 5346914388601051935L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_banco_modulo")
	private int id;

	@Column(name = "id_banco_comunal")
	private int id_banco;

	@Column(name = "id_modulo")
	private int id_modulo;

	// @OneToOne(mappedBy = "TBL_PERSONA")

}
