/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
/**
 *
 * @author w208999498
 */
@SpringBootApplication
@ImportResource("service-springConfig.xml")
public class Application {
     public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
}
