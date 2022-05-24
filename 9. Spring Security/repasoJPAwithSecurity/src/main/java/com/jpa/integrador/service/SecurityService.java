package com.jpa.integrador.service;


import com.jpa.integrador.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityService implements UserDetailsService {


    @Autowired
    BCryptPasswordEncoder encoder;

    @Autowired
    UserRespository userRespository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        com.jpa.integrador.entity.User userEntity = userRespository.findById(username)
                .orElseThrow(()-> {throw new UsernameNotFoundException("User not found");});

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        grantedAuthorities.add(new SimpleGrantedAuthority(userEntity.getRol()));
        User userDetails = new User(userEntity.getUsername(),
                encoder.encode(userEntity.getPassword()),
                grantedAuthorities);

        return userDetails;


    }
}
