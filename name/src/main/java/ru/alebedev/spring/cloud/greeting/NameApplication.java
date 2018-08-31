package ru.alebedev.spring.cloud.greeting;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigurationProperties(NameProperties.class)
@EnableDiscoveryClient
public class NameApplication {

    public static void main(String[] args) {
        SpringApplication.run(NameApplication.class, args);
    }
}
