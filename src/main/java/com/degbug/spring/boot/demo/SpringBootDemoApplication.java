package com.degbug.spring.boot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner, ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SpringBootDemoApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }


    /**
     * CommandLineRunner和ApplicationRunner的区别是两者的入参不一样
     *
     * @param args
     * @throws Exception
     */

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("执行了ApplicationRunner的run方法");
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("执行了CommandLineRunner的run方法");
    }
}
