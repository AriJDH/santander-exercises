package com.example.Sorteo.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estudiantes")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;
    @Column(name = "name")
    String name;
    @Column(name = "apellido")
    String surname;
    @Column(name = "dni")
    String dni;
    @Column(name = "curso")
    String course;
    @ManyToOne
    @JoinColumn(name = "topic_id", nullable = false)
    private Topic topic;

}
