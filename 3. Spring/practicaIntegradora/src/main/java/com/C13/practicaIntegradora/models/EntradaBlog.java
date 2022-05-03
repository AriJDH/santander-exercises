package com.C13.practicaIntegradora.models;

import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EntradaBlog {
    private Integer id;
    private String titulo;
    private String nombre;
    private Date fechaPublicacion;

}
