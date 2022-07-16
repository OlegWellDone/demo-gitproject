/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectSpring.domain;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Пользователь
 */
public class User {
    
    @NotBlank//esli ext' spring-boot-validation
    private String login;
    
    @NotBlank
    private String password;
    
    private Long id;
    
    public User(){
        
    }
    
    public User (Long id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }

    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id; 
    }
    
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String firstName) {
        this.login = login;
    }

    public void setPassword(String lastName) {
        this.password = password;
    }
    
    
    
}
