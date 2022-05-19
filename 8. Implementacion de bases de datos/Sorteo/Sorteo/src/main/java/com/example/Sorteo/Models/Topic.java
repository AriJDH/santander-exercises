package com.example.Sorteo.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;
    @Column(name = "name_topic")
    String name_topic;
    @Column(name = "complejidad")
    String complejidad;

    @OneToMany(mappedBy = "topic")
    Set<Student> students = new HashSet<>();
}
