package com.bootcamp.practicosC12P1.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Materia {
    String nombre;
    double nota;
}
