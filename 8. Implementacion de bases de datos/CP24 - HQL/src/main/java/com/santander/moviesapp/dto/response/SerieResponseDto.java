package com.santander.moviesapp.dto.response;


import com.santander.moviesapp.dto.request.SeasonRequestDto;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SerieResponseDto {
    private String title;
    private Date release_date;
    private Date end_date;
    private GenreResponseDto genre;
}
