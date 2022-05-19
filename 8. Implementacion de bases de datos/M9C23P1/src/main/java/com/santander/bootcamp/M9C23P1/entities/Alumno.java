package com.santander.bootcamp.M9C23P1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "alumnos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Alumno {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String curso;

    @ManyToOne
    private Tema tema;

}
