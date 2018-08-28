package ru.alebedev.spring.cloud.greeting;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {


    private NameProperties nameProperties;

    public NameController(NameProperties nameProperties) {
        this.nameProperties = nameProperties;
    }

    @GetMapping("/")
    public String getName() {
        return nameProperties.getName();
    }

}
