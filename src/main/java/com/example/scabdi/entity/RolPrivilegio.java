package com.example.scabdi.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(name = "tsg_rol_privilegio")

public class RolPrivilegio implements Serializable {

	private static final long serialVersionUID = 1823670661476151701L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol_privilegio")
	private int id;

	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Rol id_rol;
	
	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_privilegio", referencedColumnName = "id_privilegio")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Privilegio id_privilegio;
	
}