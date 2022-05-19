package com.example.CP23P1.dto.response;

import com.example.CP23P1.entity.Tema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AlumnoResponseDTO {
    private String nombre;
    private String apellido;
    private String dni;
    private String curso;
    private TemaResponseDTO tema;
}
