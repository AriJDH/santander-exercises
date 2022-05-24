package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

//Indica una clase encargada de la config
@Configuration
//Indica que la seguridad aplica a cualquier endpoint de la api
@EnableWebSecurity
//Autoriza un metodo (de los que estan adentro de la clase) a tomar el control
@EnableMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //Es una clase que permite tener detalle de los usuarios
    @Autowired
    UserDetailsService userDetailsService;






}
