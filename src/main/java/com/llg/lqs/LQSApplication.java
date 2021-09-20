package com.llg.lqs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LQSApplication {

    public static void main(String[] args) {
        SpringApplication.run(LQSApplication.class, args);
        log.info("Start success.");
    }
}
