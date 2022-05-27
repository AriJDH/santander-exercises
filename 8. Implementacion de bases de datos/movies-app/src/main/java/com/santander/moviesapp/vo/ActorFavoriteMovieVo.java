package com.santander.moviesapp.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ActorFavoriteMovieVo {
    private String firstName;
    private String lastName;
    private String favoriteMovie;
}
