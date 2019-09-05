package com.weimin.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class,
        ManagementWebSecurityAutoConfiguration.class})//禁用security
public class JmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsApplication.class, args);
    }
}
