package com.jpa.integrador.service;

import com.jpa.integrador.entity.UserEntity;
import com.jpa.integrador.repository.UserRepository;
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
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity user = userRepository.findByUsernameEquals(username).orElseThrow();

        if(user.getRole().equals("new")){
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_NEW"));
            var userDetails = new User(user.getUsername(), passwordEncoder.encode(user.getPassword()), grantedAuthorities);
            return userDetails;
        }

        if(user.getRole().equals("user")){
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            var userDetails = new User(user.getUsername(), passwordEncoder.encode(user.getPassword()), grantedAuthorities);
            return userDetails;
        }

        if(user.getRole().equals("admin")){
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            var userDetails = new User(user.getUsername(), passwordEncoder.encode(user.getPassword()), grantedAuthorities);
            return userDetails;
        }
        throw new UsernameNotFoundException("User not found");
    }
}
