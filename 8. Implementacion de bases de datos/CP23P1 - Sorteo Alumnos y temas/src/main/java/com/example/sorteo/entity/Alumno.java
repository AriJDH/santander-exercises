package com.example.sorteo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "alumnos")
public class Alumno {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String apellido;

    private int dni;

    private String curso;

    @ManyToOne(cascade = {
            CascadeType.PERSIST,CascadeType.MERGE
    })
    @JoinColumn(name = "tema_id", nullable = false)
    private Tema tema;
}
