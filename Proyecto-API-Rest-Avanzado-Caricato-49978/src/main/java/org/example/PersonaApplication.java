package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
//@EnableJpaRepositories(basePackages = "repositories")
@ComponentScan(basePackages = {"com.example.PersonaApplication", "repositories", "org.example.services"})
public class PersonaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonaApplication.class, args);
    }

}