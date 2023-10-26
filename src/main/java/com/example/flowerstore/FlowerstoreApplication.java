package com.example.flowerstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlowerstoreApplication {

    public static void main(String[] args) 
    {
        SpringApplication.run(FlowerstoreApplication.class, args);
    }

}
