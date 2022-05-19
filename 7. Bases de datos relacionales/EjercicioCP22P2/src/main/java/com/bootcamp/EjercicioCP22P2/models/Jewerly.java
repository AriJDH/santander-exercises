package com.bootcamp.EjercicioCP22P2.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Jewerly {

    @Id
    @GeneratedValue
    private Integer nro_identificatorio;
    @Column
    private String nombre;
    @Column
    private String material;
    @Column
    private double peso;
    @Column
    private String particularidad;
    @Column
    private boolean poseePiedra;
    @Column
    private boolean enVenta;
}
