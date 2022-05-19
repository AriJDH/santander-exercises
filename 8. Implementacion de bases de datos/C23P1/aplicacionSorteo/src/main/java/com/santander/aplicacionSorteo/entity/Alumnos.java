package com.santander.aplicacionSorteo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Alumnos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumnos {
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
    private Temas tema;
}
