package com.santander.moviesapp.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="series")
public class SerieEntity {
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

    @Column(name = "release_date", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date release_date;

    @Column(name = "end_date", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date end_date;

    @OneToMany(mappedBy = "serie", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<SeasonEntity> seasons;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private GenreEntity genre;

    @PrePersist
    void prePersist(){
        createdAt = new Date();
    }

    @PreUpdate
    void preUpdate(){
        updatedAt = new Date();
    }
}
