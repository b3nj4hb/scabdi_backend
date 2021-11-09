package com.example.scabdi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TBL_AREA")
public class Area {
@Id
@Column(name = "ID_AREA")
private int id_area;
@Column(name = "NO_AREA")
private String no_area;

}
