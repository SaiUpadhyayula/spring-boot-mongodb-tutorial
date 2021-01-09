package com.programming.techie.mongo;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class SpringBootMongodbTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongodbTutorialApplication.class, args);
    }
}
