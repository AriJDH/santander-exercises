package com.santander.moviesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MoviesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviesAppApplication.class, args);
    }

}
