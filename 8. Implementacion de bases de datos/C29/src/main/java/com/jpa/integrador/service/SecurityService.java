package com.jpa.integrador.service;

import com.jpa.integrador.entity.Role;
import com.jpa.integrador.entity.UserEntity;
import com.jpa.integrador.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityService implements UserDetailsService {


    @Autowired
    UserEntityRepository userEntityRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity= userEntityRepository.findUserEntityByUsernameEquals(username).orElseThrow(()-> new UsernameNotFoundException("Username not found"));
        List<GrantedAuthority> grantedAuthorities= new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_"+userEntity.getRole()));
        System.out.println(grantedAuthorities.get(0).getAuthority());
        return  new User(username,userEntity.getPassword(),grantedAuthorities);
    }

}
