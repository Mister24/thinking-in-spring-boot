package com.fayuan.springbootchapter5.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.fayuan.springbootchapter5.dao"})
public class SpringBootChapter5Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootChapter5Application.class, args);
    }

}
