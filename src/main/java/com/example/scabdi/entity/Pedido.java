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
@Table(name = "tbl_pedido")

public class Pedido implements Serializable {

	private static final long serialVersionUID = 6218551916461230253L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private int id;

	@Column(name = "id_persona")
	private int id_persona;

	@Column(name = "de_pedido")
	private String descripcion;

	@Column(name = "fe_pedido")
	private String fecha;

	// @OneToOne(mappedBy = "TBL_PERSONA")

}
