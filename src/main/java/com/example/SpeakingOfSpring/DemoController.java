package com.example.SpeakingOfSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {
    @GetMapping("/greet")
    public List<String> greet() {
        List<String> helloWorldList=new ArrayList<>();
        helloWorldList.add("First Spring Boot Work.");
        helloWorldList.add("Hello world");
        for (int i = 2; i < 7; i++) {
            helloWorldList.add("Hello world for " + i + " times ");
        }
        return helloWorldList;
    }
}
