package com.jpa.school.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

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

    @Column(name = "disabled")
    private Boolean disabled;

    @Column(name="fecha_nacimiento")
    private LocalDate dateOfBirth;
    // Este lado siempre debe existir
    // Eager por defecto
    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private Course course;
    // Eager por defecto
    @OneToOne(
            cascade = {
                    CascadeType.REMOVE,
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "idLegajo", referencedColumnName = "id")
    private Legajo legajo;



    // Lazy por defecto
    @ManyToMany()
    @JoinTable(
            name = "subject_student",
            joinColumns = @JoinColumn(name = "student_id_en_tabla_externa", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id_en_tabla_externa", referencedColumnName = "id")
    )
    private Set<Subject> subject;
}
