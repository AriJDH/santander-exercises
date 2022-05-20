package com.jpa.JoyeriaLasPerlas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name= "joyas")
public class Joya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nro_identificatorio;

    @Column(length = 50)
    private String nombre;

    @Column(length = 10)
    private String material;

    @Column
    private double peso;

    @Column
    private String particularidad;

    @Column
    private boolean posee_piedra;

    @Column
    private boolean ventaONo;
}
