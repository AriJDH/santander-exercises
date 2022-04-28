package com.practica.C13Blog.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RespuestaEntradaBlogDto {
    Integer id_entrada;
    final String mensaje = "Nueva entrada al blog realizada con éxito";
}
