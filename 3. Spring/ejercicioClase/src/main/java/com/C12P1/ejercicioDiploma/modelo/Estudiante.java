package com.C12P1.ejercicioDiploma.modelo;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Estudiante {
    private String name;
    private List<Materia> subjects;

}