package com.santander.moviesapp.dto.response;



import lombok.*;
import java.math.BigDecimal;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class MovieResponseDto {

    private String title;
    private Integer awards;

}
