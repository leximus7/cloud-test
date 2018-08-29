package ru.alebedev.spring.cloud.greeting;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NameService {
    private static final String URL = "http://localhost:8091";

    private RestTemplate restTemplate;

    public NameService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getName() {
        return restTemplate.getForObject(URL, String.class);
    }
}
