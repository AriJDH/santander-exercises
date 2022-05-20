package com.santander.moviesapp.repository;
import com.santander.moviesapp.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActorRepository extends JpaRepository<ActorEntity, Integer> {

}
