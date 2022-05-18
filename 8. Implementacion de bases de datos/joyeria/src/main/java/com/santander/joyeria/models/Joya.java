package com.santander.joyeria.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "joyas")
public class Joya {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numero_identificatorio;
    @Column
    private String nombre;
    @Column
    private String material;
    @Column
    private Integer peso;
    @Column
    private String particularidad;
    @Column
    private Boolean posee_piedra;
    @Column
    private Boolean ventaONo;

}