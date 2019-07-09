package com.chad.test.demojunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = {"com.chad.test.demojunit.*"})
public class DemoJunitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJunitApplication.class, args);
    }

}
