package com.santander.moviesapp.dto.response;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SerieResponseDto {
    private String title;
    private Date release_date;
    private Date end_date;
    private String genre;
}
