package com.jpa.integrador.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private UserDetailsService userDetailsServices;


    @Autowired
    JwtAuthenticationFilter jwtAuthenticationFilter;

    @Autowired
    JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // CSRF token es un mecanismo de autenticacion ante hackeos en navegador.
                // Nosotros usaremos JWT para autenticar, con lo cual, deshabilitaremos CSRF.
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/helloWorld").permitAll()
                .antMatchers("/helloUser").hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
                .antMatchers("/helloAdmin").hasAuthority("ROLE_ADMIN")
                .antMatchers("/login").permitAll()
                .and()
                // Configura una seguridad basica con user, pass y roles
                .httpBasic()
                // And nos habilita a seguir poniendo mas configuraciones.
                .and()
                // sessionManagement nos permite configurar las sesiones
                // SessionCreationPolicy esta encargada de delimitar
                // STATELESS es una variable que nos permite declarar que la session se manejara
                // en otro lugar, y no a traves del security context.
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint)
                .and().addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean()throws Exception{
        return super.authenticationManagerBean();
    }
    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsServices).passwordEncoder(passwordEncoder());
    }

    @Bean
    public static BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



}
