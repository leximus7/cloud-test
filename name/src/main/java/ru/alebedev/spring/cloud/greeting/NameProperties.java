package ru.alebedev.spring.cloud.greeting;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class NameProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
