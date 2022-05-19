package com.jpa.school.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "cursos")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nombre")
    private String name;

    //si no le pones mappyedBy, se genera una tabla intermedia
    // tenemos que delegarle
    @OneToMany(mappedBy = "course")
    private Set<Student> student = new HashSet<>();
}
