package com.jpa.school.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

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

    @Transient
    private Integer age;

    @Column(name = "disabled")
    Boolean disabled;

    @Column(name="fecha_nacimiento")
    private LocalDate dateOfBirth;
    
    @OneToOne
    @JoinColumn(name = "idLegajo", referencedColumnName="id")
    private Legajo legajo;

    // Este lado siempre debe existir
    @ManyToOne
    private Course course;
}
