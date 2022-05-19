package com.bootcamp.HibernateProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column
    private String dni;

    @Column
    private String name;

}
