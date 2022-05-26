package com.jpa.integrador.repository;

import com.jpa.integrador.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity,Integer> {

    public Optional<UserEntity> findUserEntityByUsernameEquals(String username);
}
