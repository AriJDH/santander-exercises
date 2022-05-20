package com.jpa.school.entity;

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
@Table(name = "cursos")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
            //GenerationType.IDENTITY) //se ya existe genera error, si no existe lo crea
    private Integer id;

    @Column(name = "nombre")
    private String name;

    //usar mappedBy para que no sea redundante, creando otras relaciones innecesarias
    //siempre en OneTo Many lleva mappedBy
    //Lazy por defecto
    @OneToMany(mappedBy = "course")
    private Set<Student> student = new HashSet<>();
}
