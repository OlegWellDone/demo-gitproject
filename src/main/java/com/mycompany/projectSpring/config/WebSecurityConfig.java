/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectSpring.config;

import org.springframework.context.annotation.Bean;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 *
 * @author Пользователь
 */

@EnableWebSecurity
public class WebSecurityConfig {
    
    @Bean
    public UserDetailsService userDetailsService(){//zdes' sdelat' mozhno proverku na nalichie usera v baze dannyix JDBCDetailsManager
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder().username("user").password("12345").roles("USER").build());
        manager.createUser(User.withDefaultPasswordEncoder().username("admin").password("admin").roles("ADMIN").build());
        manager.createUser(User.withDefaultPasswordEncoder().username(" ").password(" ").roles(" ").build());
        return manager;
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        
        http
        .csrf().disable()
        .authorizeRequests(authorize -> authorize.anyRequest().authenticated())
        .formLogin(withDefaults());
        
        return http.build();
    }
    
  
    
}
