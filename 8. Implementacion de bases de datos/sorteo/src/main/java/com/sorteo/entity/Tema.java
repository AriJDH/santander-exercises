package com.sorteo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tema_id;

    private String nombreTema, complejidad;

}
