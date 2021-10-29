package com.example.scabdi.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Data;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TSG_PRIVILEGIO")
public class Privilegio {
    @Id
    @Column(name="ID_PRIVILEGIO")
    private int id_privilegio;
    @Column(name="NO_PRIVILEGIO")
    private String no_privilegio;
}
