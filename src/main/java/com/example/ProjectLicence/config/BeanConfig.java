package com.example.ProjectLicence.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.locks.StampedLock;

@EnableWebMvc
@Configuration
@ComponentScan("com.example")
public class BeanConfig implements WebMvcConfigurer {

    @Bean
    public StampedLock getStampedLock(){
        return new StampedLock();
    }

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}