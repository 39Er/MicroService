package com.weimin.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsApplication.class, args);
    }
}
