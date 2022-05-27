package com.ejercicios.C25P1.repository;

import com.ejercicios.C25P1.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserReporistory extends JpaRepository<UserEntity,Integer> {
    UserEntity findByUsernameEquals(String username);
}
