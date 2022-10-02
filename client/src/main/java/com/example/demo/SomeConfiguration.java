package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfiguration {
    @Bean
    CommandLineRunner foo(AppConfiguration config) {
        return args -> {
            System.out.println(config);
        };
    }
}
