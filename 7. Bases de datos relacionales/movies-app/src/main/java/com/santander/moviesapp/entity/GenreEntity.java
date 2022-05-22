package com.santander.moviesapp.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name="genres")
public class GenreEntity {
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

    @Column(name = "name")
    private String name;

    @Column(name = "ranking")
    private Integer ranking;

    @Column(name = "active")
    private Boolean active;

    @OneToMany(mappedBy = "genre"
            , cascade = {CascadeType.PERSIST}
            , fetch = FetchType.LAZY)
    private List<MovieEntity> movies;

    /*
    @PreUpdate
    private void preUpdate(){
        this.updateddAt = LocalDateTime.now();
    }

    @PrePersist
    private void prePersist(){
        this.createdAt = LocalDateTime.now();
    }*/
}
