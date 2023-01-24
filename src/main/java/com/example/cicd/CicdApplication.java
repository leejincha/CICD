package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.Thread.sleep;

@SpringBootApplication
public class CicdApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(CicdApplication.class, args);
        sleep(100000);
    }

}
