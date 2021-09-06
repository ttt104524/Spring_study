package com.tfy.config;

import com.tfy.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class tfyConfig {

    @Bean
    public Dog dog(){
        return new Dog();
    }
}
