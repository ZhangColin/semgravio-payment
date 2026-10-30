package com.semgravio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SemgravioPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(SemgravioPaymentApplication.class, args);
    }
}
