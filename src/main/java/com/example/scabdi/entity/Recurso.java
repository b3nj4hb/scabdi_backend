package com.example.scabdi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/*import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;*/
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBL_RECURSO")

public class Recurso implements Serializable {

	private static final long serialVersionUID = 319819275701613594L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_RECURSO")
	private int id;
/*
	@ManyToOne
	@JoinColumn(name = "ID_SESION", nullable = false)
	private Sesion id_sesion;

	@ManyToOne
	@JoinColumn(name = "ID_TIPO_RECURSO", nullable = false)
	private TipoRecurso id_tipo_recurso;
*/
	@Column
	private int id_sesion;
	
	@Column
	private int id_tipo_recurso;

	@Column(name = "NO_RECURSO")
	private String no_recurso;

	@Column(name = "FI_RECURSO")
	private String fi_recurso;

	@Column(name = "URL_RECURSO")
	private String url_recurso;
}
