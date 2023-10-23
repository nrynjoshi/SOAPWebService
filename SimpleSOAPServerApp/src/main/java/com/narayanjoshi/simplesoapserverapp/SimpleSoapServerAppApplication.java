package com.narayanjoshi.simplesoapserverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;

@SpringBootApplication
@EnableWs
@Configuration
public class SimpleSoapServerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSoapServerAppApplication.class, args);
    }

}
