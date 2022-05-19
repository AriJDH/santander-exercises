package com.example.sorteo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentResponseDTO {
    private Integer id;
    private String name;
    private String surname;
    private String dni;
    private String course;
}
