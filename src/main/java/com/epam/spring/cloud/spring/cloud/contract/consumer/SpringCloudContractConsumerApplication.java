package com.epam.spring.cloud.spring.cloud.contract.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringCloudContractConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudContractConsumerApplication.class, args);
    }

}
