package ru.alebedev.spring.cloud.greeting;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private GreetingService greetingService;

    private NameService nameService;

    public WebController(GreetingService greetingService, NameService nameService) {
        this.greetingService = greetingService;
        this.nameService = nameService;
    }

    @RequestMapping("/")
    public String index() {
//        return "qweasd";
        return greetingService.getGreeting() + ", " + nameService.getName();
    }

}
