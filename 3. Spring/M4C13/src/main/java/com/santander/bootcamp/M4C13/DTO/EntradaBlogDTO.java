package com.santander.bootcamp.M4C13.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.santander.bootcamp.M4C13.configurations.Constants;
import com.santander.bootcamp.M4C13.models.EntradaBlog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntradaBlogDTO {

    private int id;
    private String titulo;
    private String autor;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaPublicacion;

    public EntradaBlogDTO(EntradaBlog entradaBlog) {
        this.id = entradaBlog.getId();
        this.titulo = entradaBlog.getTitulo();
        this.autor = entradaBlog.getAutor();
        this.fechaPublicacion = entradaBlog.getFechaPublicacion();
    }

    public String getUrl () {
        return String.format("%s/blog/%d", Constants.HOST, this.id);
    }

}
