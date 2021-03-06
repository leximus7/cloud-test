package ru.alebedev.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
//        new SpringApplicationBuilder(EurekaApplication.class).web(true).run(args);
		SpringApplication.run(EurekaApplication.class, args);
	}
}
