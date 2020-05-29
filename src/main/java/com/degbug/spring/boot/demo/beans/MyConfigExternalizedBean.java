package com.degbug.spring.boot.demo.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyConfigExternalizedBean {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${name}")
    private String name;

    @PostConstruct
    public void init() {
        logger.info("name:{}", name);
    }
}
