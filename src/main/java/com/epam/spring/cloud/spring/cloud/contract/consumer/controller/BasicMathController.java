package com.epam.spring.cloud.spring.cloud.contract.consumer.controller;

import com.epam.spring.cloud.spring.cloud.contract.consumer.EvenOddApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BasicMathController {

    private final EvenOddApi evenOddApi;

    public BasicMathController(final EvenOddApi evenOddApi) {
        this.evenOddApi = evenOddApi;
    }

    @GetMapping("/calculate")
    public String checkOddAndEven(@RequestParam("number") Integer number) {
        return evenOddApi.isNumberPrime(number);
    }
}