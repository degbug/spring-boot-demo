package com.degbug.spring.boot.demo.config;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExitCodeGeneratorBeanConfiguration {

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }
}
