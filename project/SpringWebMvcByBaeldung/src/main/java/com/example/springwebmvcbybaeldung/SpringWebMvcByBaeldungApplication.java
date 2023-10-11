package com.example.springwebmvcbybaeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringWebMvcByBaeldungApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebMvcByBaeldungApplication.class, args);
    }

}
