package com.jpa.integrador.repository;

import com.jpa.integrador.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<Users,Integer> {
    public List<Users> findByUsername(String name);
}
