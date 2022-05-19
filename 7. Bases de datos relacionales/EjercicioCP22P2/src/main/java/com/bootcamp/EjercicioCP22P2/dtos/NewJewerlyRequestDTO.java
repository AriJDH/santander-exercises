package com.bootcamp.EjercicioCP22P2.dtos;

import lombok.Data;

@Data
public class NewJewerlyRequestDTO {

    private Integer nro_identificatorio;
    private String nombre;
    private String material;
    private double peso;
    private String particularidad;
    private boolean poseePiedra;
    private boolean enVenta;

}
