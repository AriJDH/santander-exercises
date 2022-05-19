package com.jpa.school.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

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

    @OneToOne(
            cascade = {
                    //Cuando borre persona, borre legajo
                CascadeType.REMOVE,
                    //cuando cree persona, creo legajo
                CascadeType.PERSIST
            })
    @JoinColumn(name = "idLegajo", referencedColumnName="id")
    private Legajo legajo;

    // Este lado siempre debe existir
    // Eager por defecto (termina en One)
    @ManyToOne
    private Course course;

    // Lazy por defecto (termina en Many)
    @ManyToMany
    // se genera por defecto pero aca podemos especificar el nombre
    @JoinTable(
            name="subject_student",
            joinColumns = @JoinColumn(name = "student_id_en_tabla_externa", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id_en_tabla_externa", referencedColumnName = "id")
        )
    private Set<Subject> subject;
}
