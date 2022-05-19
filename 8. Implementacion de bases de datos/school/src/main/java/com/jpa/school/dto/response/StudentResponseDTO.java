package com.jpa.school.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentResponseDTO {
    Integer id;
    String dni;
    String name;
    Boolean disabled;
}
