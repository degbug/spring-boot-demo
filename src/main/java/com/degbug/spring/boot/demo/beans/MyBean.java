package com.degbug.spring.boot.demo.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 注入ApplicationArguments获取参数
     *
     * @param arguments 对args
     */
    @Autowired
    public MyBean(ApplicationArguments arguments) {
    }
}
