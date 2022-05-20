package com.santander.moviesapp.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name="movies")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "created_at")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateddAt;

    @Column(name = "title")
    private String title;

    @Column(name = "rating"
            , precision = 3
            , scale = 1
            , nullable = false)
    private BigDecimal rating;

    @Column(name = "awards")
    private Integer awards;

    @Column(name = "release_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date releaseDate;

    @Column(name = "length")
    private Integer length;

    @ManyToOne
    @JoinColumn(name="genre_id")
    //@NotFound(action = NotFoundAction.IGNORE)
    private GenreEntity genre;

    @OneToMany(mappedBy = "favoriteMovie")
    private List<ActorEntity> actorsFavorite;

    @OneToMany(mappedBy = "movie")
    private List<ActorMovieEntity> actorsMovies;

}
