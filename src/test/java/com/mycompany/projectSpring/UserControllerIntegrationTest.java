/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectSpring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 *
 * @author Пользователь
 */
/*
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerIntegrationTest {
    
    @Test
    void getUsername(@Autowired TestRestTempplate restTemplate) {
        //Arrange
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cookie", cookie(restTemplate));
        
        //Act
        ResponseEntity <String> response = restTemplate.exchange("/users/username", HttpMethod.GET, new HttpEntity<String>, String.class);
        
        //Assert
        Assertions.assertThat(response.getBody()).isEqualTo("Hi there");
    }
    
    public String cookie(TestRestTemplate restTemplate){
       String username = "user";
       String password = "12345";
       
       MultiValueMap<String, String> form = new LinkedMultiValueMap<>();
       form.set("login", username);
       form.set("password", password);
       
       ResponseEntity<String> loginResponse = restTemplate.postForEntity(url:"/login", new HttpEntity<>(form, new HttpHeaders())String.class);
       return loginResponse.getHeaders().get("Set Cookie").get(0);
    }
    
}*/
