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
@Table(name = "TBL_TIPO_RECURSO")

public class TipoRecurso implements Serializable {

	private static final long serialVersionUID = -8761539997037771310L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_RECURSO")
	private int id_tipo_recurso;

	@Column(name = "NO_TIPO_RECURSO")
	private String no_tipo_recurso;

	/*
	// RELACIONES
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_tipo_recurso")
	private Set<Recurso> recurso;
	*/
}
