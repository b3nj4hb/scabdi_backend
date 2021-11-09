package com.example.scabdi.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="TSG_ROL")
public class Rol {
@GeneratedValue(strategy = GenerationType.AUTO)
@Id
@Column(name = "ID_ROL")
private int id_rol;
@Column(name = "NO_ROL")
private String no_rol;

}
