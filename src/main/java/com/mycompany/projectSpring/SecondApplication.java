/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Пользователь
 */

@SpringBootApplication//pometka, chto eto prilozhenie i ono zapuskaet auto config glavnoe sdelat' podk;lucheniye v pom.xml
public class SecondApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecondApplication.class, args);//dlya zapuska prilozheniya
        
    }
    //тесты писать надо в папке тест повторяя иерархию Пакетов а класс называть как и тестируемый класс с префиксом тест
    
    
}
