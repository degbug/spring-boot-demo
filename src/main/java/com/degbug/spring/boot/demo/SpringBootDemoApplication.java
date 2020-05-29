package com.degbug.spring.boot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@Order(3)
public class SpringBootDemoApplication implements CommandLineRunner, ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SpringBootDemoApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
        //自定义退出码
        //1. 定义实现ExitCodeGenerator的接口的bean
        //2.调用下面的一行代码
//        System.exit(SpringApplication.exit(SpringApplication.run(SpringBootDemoApplication.class, args)));
    }


    /**
     * CommandLineRunner和ApplicationRunner的区别是两者的入参不一样
     *
     * @param args
     * @throws Exception
     */

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("执行了ApplicationRunner的run方法，顺序3");
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("执行了CommandLineRunner的run方法，顺序3");
    }
}
