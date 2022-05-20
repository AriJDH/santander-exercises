package com.santander.moviesapp.entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="episodes")
public class EpisodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "created_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    //@CreatedDate
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    //@LastModifiedDate
    private Date updatedAt;

    @Column(name = "title", length = 500, nullable = false)
    private String title;

    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "release_date", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date release_date;

    @Column(name = "rating"
            , precision = 3
            , scale = 1
            , nullable = false)
    private BigDecimal rating;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private SeasonEntity season;

    @OneToMany(mappedBy = "episode")
    private List<ActorEpisodioEntity>  episodesActors;


    @PrePersist
    void prePersist(){
        createdAt = new Date();
    }

    @PreUpdate
    void preUpdate(){
        updatedAt = new Date();
    }

}
