package ru.alebedev.spring.cloud.greeting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private GreetingProperties greetingProperties;

    public GreetingController(GreetingProperties greetingProperties) {
        this.greetingProperties = greetingProperties;
    }

    @RequestMapping("/{languageCode}")
    public String getGreeting(@PathVariable String languageCode) {
        return greetingProperties.getGreetings().getOrDefault(languageCode.toUpperCase(), greetingProperties.getGreeting());

    }

    @RequestMapping("/")
    public String getGreeting(){
        return greetingProperties.getGreeting();
    }
}
