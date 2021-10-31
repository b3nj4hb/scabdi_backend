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
@Table(name = "TBL_ROL_PRIVILEGIO")

public class RolPrivilegio implements Serializable {

	private static final long serialVersionUID = -887974768831583437L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ROL_PRIVILEGIO")
	private int id;

	@Column(name = "ID_ROL")
	private int id_rol;

	@Column(name = "ID_PRIVILEGIO")
	private int id_privilegio;

}
