package com.curiousgeek.curiousgeekblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class CuriousGeekBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CuriousGeekBlogApplication.class, args);
    }

}
