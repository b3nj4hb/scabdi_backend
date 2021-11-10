package com.example.scabdi.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_banco_comunal" )

public class BancoComunal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_banco_comunal")
	public int id_bancocomunal;
	
	@ManyToOne
	@JoinColumn(name="id_sede", nullable = false)
	private Sede idsede;
	
	@Column(name = "no_banco_comunal")
	public String no_bancocomunal;
	
	@Column(name = "es_banco_comunal")
	public int es_bancocomunal;
	
	
	
}
