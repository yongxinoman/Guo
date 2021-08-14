package org.richard.config;

import org.richard.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RichardConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
