package com.jpa.school.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "materias")
public class Subject {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre", length = 50)
    private String name;

    //cuando vamos a estudiante que aparece? subject, entonces ahi va el mappedby
    @ManyToMany(mappedBy = "subject")
    private Set<Student> student;

}
