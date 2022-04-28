package com.blogExcepciones.blogExcepciones.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;

@ToString
@Data
@AllArgsConstructor
public class EntradaBlog {
    private String id, titulo,nombre;
    private LocalDate fpublicacion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntradaBlog that = (EntradaBlog) o;
        return Objects.equals(id, that.id);
    }


}
