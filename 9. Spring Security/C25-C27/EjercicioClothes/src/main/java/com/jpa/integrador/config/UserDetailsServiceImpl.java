package com.jpa.integrador.config;

import com.jpa.integrador.entity.Users;
import com.jpa.integrador.repository.UserRepository;
import net.bytebuddy.build.Plugin;
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
        Users usuario = userRepository.findByUsername(username).stream().findFirst().orElseThrow(()->new UsernameNotFoundException("Usuario invalido"));
        System.out.println(usuario.getRole());
        if (usuario.getRole().equals("admin")){

            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            var userDetails = new User(usuario.getUsername(),usuario.getPassword(),grantedAuthorities);
            return userDetails;
        }
        if(usuario.getRole().equals("user")){
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            var userDetails = new User(usuario.getUsername(), usuario.getPassword(), grantedAuthorities);
            return userDetails;
        }
        throw new UsernameNotFoundException("User not found");
    }

}
