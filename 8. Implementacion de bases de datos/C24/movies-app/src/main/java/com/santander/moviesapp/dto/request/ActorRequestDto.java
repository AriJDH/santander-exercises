package com.santander.moviesapp.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ActorRequestDto {
    private String firstName;
    private String lastName;
    private BigDecimal rating;
    private Integer favoriteMovie;
}
