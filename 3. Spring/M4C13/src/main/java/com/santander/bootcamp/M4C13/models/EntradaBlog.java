package com.santander.bootcamp.M4C13.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.santander.bootcamp.M4C13.DTO.EntradaBlogDTO;
import com.santander.bootcamp.M4C13.configurations.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntradaBlog {

    private int id;
    private String titulo;
    private String autor;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaPublicacion;

    public EntradaBlog(EntradaBlogDTO entradaBlogDTO) {
        this.id = entradaBlogDTO.getId();
        this.titulo = entradaBlogDTO.getTitulo();
        this.autor = entradaBlogDTO.getAutor();
        this.fechaPublicacion = entradaBlogDTO.getFechaPublicacion();
    }

    public String getUrl () {
        return String.format("%s/blog/%d", Constants.HOST, this.id);
    }

}
