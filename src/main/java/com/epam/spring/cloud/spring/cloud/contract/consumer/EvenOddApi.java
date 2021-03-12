package com.epam.spring.cloud.spring.cloud.contract.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "evenOdd-service", url = "${producer.contract.url}")
public interface EvenOddApi {

    @GetMapping(value = "/validate/prime-number")
    String isNumberPrime(@RequestParam("number") Integer number);
}
