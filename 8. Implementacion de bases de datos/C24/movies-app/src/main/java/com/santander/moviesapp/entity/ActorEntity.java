package com.santander.moviesapp.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name="actors")
@EntityListeners(AuditingEntityListener.class)
public class ActorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Integer id;

    @Column(name = "created_at")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "rating"
          , precision = 3
          , scale = 1
          , nullable = false)
    private BigDecimal raiting;

    @ManyToOne(cascade = {CascadeType.PERSIST}, fetch = FetchType.EAGER)
    @JoinColumn(name="favorite_movie_id", referencedColumnName = "id")
    //@NotFound(action = NotFoundAction.IGNORE)
    private MovieEntity favoriteMovie;

    @OneToMany(mappedBy = "actor")
    private List<ActorMovieEntity> moviesActors;

    @OneToMany(mappedBy = "actor")
    private List<ActorEpisodioEntity> episodiesActors;

}
