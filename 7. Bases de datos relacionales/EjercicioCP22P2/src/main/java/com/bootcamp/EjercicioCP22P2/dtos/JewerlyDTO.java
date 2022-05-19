package com.bootcamp.EjercicioCP22P2.dtos;

import lombok.Data;

import javax.persistence.Column;

@Data
public class JewerlyDTO {
    private String nombre;
    private String material;
    private double peso;
    private String particularidad;
    private boolean poseePiedra;
    private boolean enVenta;
}
