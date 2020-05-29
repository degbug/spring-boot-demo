package com.degbug.spring.boot.demo.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void run(String... args) throws Exception {
        logger.info("执行了CommandLineRunnerImpl的run方法");
    }
}
