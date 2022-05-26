package com.ejercicios.C25P1.service;


import com.ejercicios.C25P1.entity.UserEntity;
import com.ejercicios.C25P1.repository.IUserRepository;
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
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    IUserRepository iUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = iUserRepository.findByUsernameEquals(username);
        if (userEntity == null){
            throw new UsernameNotFoundException("Usuario inexistente");
        }

        if (userEntity.getRoll().equals("admin")) {
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            var userDetails = new User(userEntity.getUsername(), passwordEncoder.encode(userEntity.getPassword()), grantedAuthorities);
            return userDetails;
        }
        if (userEntity.getRoll().equals("user")) {
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            var userDetails = new User(userEntity.getUsername(), passwordEncoder.encode(userEntity.getPassword()), grantedAuthorities);
            return userDetails;
        }
        throw new UsernameNotFoundException("User not found");
    }

}
