package com.jpa.integrador.service;


import com.jpa.integrador.config.JwtUtil;
import com.jpa.integrador.config.SecurityConfig;
import com.jpa.integrador.entity.UserEntity;
import com.jpa.integrador.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserEntityRepository userEntityRepository;

    @Autowired
    SecurityService securityService;

    @Autowired
    JwtUtil jwtUtil;


    public String login(String username, String password){
        UserEntity userEntity=userEntityRepository.findUserEntityByUsernameEquals(username).orElseThrow(()->new RuntimeException());
        if(!SecurityConfig.passwordEncoder().matches(password,userEntity.getPassword())) return null;
        return jwtUtil.generateToken(securityService.loadUserByUsername(username));
    }


    public String helloAdmin() {
        return "Hola admin";
    }
}
