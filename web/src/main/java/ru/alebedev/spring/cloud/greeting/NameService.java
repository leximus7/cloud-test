package ru.alebedev.spring.cloud.greeting;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class NameService {
    private NameFeignClient nameFeignClient;

    public NameService(NameFeignClient nameFeignClient) {
        this.nameFeignClient = nameFeignClient;
    }

    public String getName() {
        return nameFeignClient.getName();
    }

    @FeignClient("name")
    static interface NameFeignClient {
        @RequestMapping("/")
        public String getName();
    }
}
