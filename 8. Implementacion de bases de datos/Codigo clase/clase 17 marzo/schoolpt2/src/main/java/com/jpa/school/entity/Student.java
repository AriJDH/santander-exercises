package com.jpa.school.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "estudiantes")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "documento")
    private String dni;

    @Column(name = "nombre")
    private String name;

    @Transient //para que no vaya a la bd, esto se hace en casos donde no quiero guardar el dato en mi tabla.
    private Integer age;

}
