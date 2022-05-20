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

    @ManyToMany(mappedBy = "subject")
    private Set<Student> student;
}
