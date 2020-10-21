package com.yate.spring.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/message")
    public String getMesage() {
        return "Bienvenido a Docker";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
