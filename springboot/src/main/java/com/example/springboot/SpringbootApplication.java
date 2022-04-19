package com.example.springboot;

import com.example.springboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(SpringbootApplication.class, args);
        UserService userService=context.getBean(UserService.class);
        userService.Test();
    }

}
