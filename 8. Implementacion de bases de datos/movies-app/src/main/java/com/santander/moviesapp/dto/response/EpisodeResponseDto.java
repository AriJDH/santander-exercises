package com.santander.moviesapp.dto.response;


import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EpisodeResponseDto {

    private String title;
    private Integer number;
    private Date release_date;
}
