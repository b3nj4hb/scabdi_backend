package com.example.scabdi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_socio")

public class Socio implements Serializable {

	private static final long serialVersionUID = 9056228635929990065L;

	@Id
	@Column(name = "id_persona")
	private int id_persona;

	@Column(name = "id_banco_comunal")
	private String id_banco_comunal;

	// @OneToOne(mappedBy = "TBL_PERSONA")

}
