package com.example.samplefortune.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class SampleService {
    
    public String getFortune() {
        Random random = new Random();
        int num = random.nextInt(3);
        String[] fortunes = {"大吉", "中吉", "小吉"};
        return fortunes[num];
    }
}
