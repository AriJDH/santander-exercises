package com.santander.moviesapp.dto.response;


import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ActorResponseDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private Double rating;
}
