package com.javagda25.cloud.randomizingmachine.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomizingController {
    @Value("${random.words}")
    private String[] words;
    @Value("${random.numbers}")
    private String[] numbers;

    @GetMapping("/word")
    public String randomWord() {
        int random = new Random().nextInt(words.length);
        return words[random];
    }

    @GetMapping("/number")
    public String randomNumber() {
        int random = new Random().nextInt(numbers.length);
        return numbers[random];
    }
}
