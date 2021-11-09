package com.example.scabdi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TSG_PRVIVILEGIO")
public class Privilegio {
@Id
@Column(name = "ID_PRIVILEGIO")
private int id_privilegio;
@Column(name = "NO_PRIVILEGIO")
private String no_privilegio;
}
