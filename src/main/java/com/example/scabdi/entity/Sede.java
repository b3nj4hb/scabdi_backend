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
@Table(name="tbl_sede")
public class Sede implements Serializable {
	
	/**
	 * BENJA
	 */
	private static final long serialVersionUID = 75229161586758334L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sede")
	private int idsede;
	
	@Column(name= "no_sede")
	private String nombreSede;
	
	@Column(name= "es_sede")
	private int estadoSede;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_banco_comunal")
	private Set<BancoComunal> bancocomunal;
}
