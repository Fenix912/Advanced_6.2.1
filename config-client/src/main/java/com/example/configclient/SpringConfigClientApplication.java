package com.example.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigClientApplication.class, args);
    }
}
