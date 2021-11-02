package com.example.scabdi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBL_PEDIDO")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PEDIDO")
	private int id;
	@Column(name = "ID_PERSONA")
	private int id_p;
	@Column(name = "DE_PEDIDO")
	private String descripcion;
	@Column(name = "FE_PEDIDO")
	private String fecha;
}