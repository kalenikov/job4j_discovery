package ru.job4j.discovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Job4jDiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Job4jDiscoveryServerApplication.class, args);
    }
}
