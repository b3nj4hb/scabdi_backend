package com.example.scabdi.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "tsg_usuario")

public class Usuario implements Serializable{

	private static final long serialVersionUID = -7299684846624197312L;

	@Id
	@Column(name = "id_persona")
	private int id;
	
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Persona id_persona;
	
	@Column(name = "us_nombre")
	private String username;

	@Column(name = "pw_usuario")
	private String password;
	
	@Column(name = "es_usuario")
	private boolean estado;
	

	//Relaciones
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "id_persona")
	@JsonIgnore
	private List<UsuarioRol> usuarioRol = new ArrayList<>();
	
	public boolean getEstado() {
		return this.estado;
	}
	
}