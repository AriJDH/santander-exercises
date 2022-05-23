package com.santander.sorteo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "apellido")
    private String apellido;

    @Column (name = "dni")
    private Integer dni;

    @Column (name = "curso")
    private String curso;

    @ManyToOne
    @JoinColumn(name = "temaId", nullable = false)
    private Tema tema;
}
