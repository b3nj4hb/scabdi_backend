package com.example.scabdi.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rol")
public class Rol implements Serializable {

	private static final long serialVersionUID = 3044526150198373369L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idrol")
	private int id;
	private String nomrol;
	@ManyToMany(mappedBy = "roles")
	private List<Usuario> usuarios = new ArrayList<>(); 
}
