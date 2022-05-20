package com.santander.moviesapp.repository;


import com.santander.moviesapp.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovieRepository extends JpaRepository<MovieEntity, Integer> {


}
