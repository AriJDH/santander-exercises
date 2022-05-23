package com.santander.sorteo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tema")
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre del tema")
    private String nombreTema;

    @Column(name = "complejidad")
    private String complejidad;

    @OneToMany(mappedBy = "tema")
    private Set<Alumno> alumnos = new HashSet<>();
}
