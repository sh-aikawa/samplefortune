package com.example.samplefortune.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.samplefortune.service.SampleService;

import org.springframework.ui.Model;
import java.util.Random;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SampleController {
    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/page1")
    public String page1() {
        return "page1"; // This will resolve to src/main/resources/templates/page1.html
    }

    @GetMapping("/page2")
    public String page2() {
        return "page2"; // This will resolve to src/main/resources/templates/page2.html
    }

    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @PostMapping("/result")
    public String sample(@RequestParam String name,
                            @RequestParam int age,
                            Model model) {
        String result = sampleService.getFortune();
        model.addAttribute("result", result);
        model.addAttribute("name", name);
        model.addAttribute("age", age);


        return "sample"; // This will resolve to src/main/resources/templates/index.html
    }
    
    @GetMapping("/form")
    public String form() {
        return "form"; // This will resolve to src/main/resources/templates/form.html
    }
    
}
