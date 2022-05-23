package com.santander.moviesapp.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name="seasons")
public class SeasonEntity {
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

    @Column(name = "end_date", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date end_date;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private SerieEntity serie;

    @OneToMany(mappedBy = "season", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<EpisodeEntity> episodes;

    @PrePersist
    void prePersist(){
        createdAt = new Date();
    }

    @PreUpdate
    void preUpdate(){
        updatedAt = new Date();
    }
}
