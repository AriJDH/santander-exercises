package com.santander.aplicacionSorteo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Temas {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String nombreTema;
    @Column
    private String complejidad;
    @OneToMany(mappedBy = "tema")
    private Set<Alumnos> alumnosSet;
}
