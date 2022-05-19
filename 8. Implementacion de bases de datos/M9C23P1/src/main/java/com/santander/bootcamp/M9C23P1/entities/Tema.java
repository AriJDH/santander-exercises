package com.santander.bootcamp.M9C23P1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "temas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tema {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String nombreTema;

    @Column
    private String complejidad;

    @OneToMany(mappedBy = "tema")
    private Set<Alumno> alumnosSet;

}
