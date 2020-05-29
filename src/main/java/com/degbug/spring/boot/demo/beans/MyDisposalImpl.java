package com.degbug.spring.boot.demo.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * 销毁事件，在退出前调用
 * 注解PreDestroy会比实现DisposableBean的先调用
 */
@Component
public class MyDisposalImpl implements DisposableBean {

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    public void destroy() throws Exception {
        logger.info("销毁前调用MyDisposalImpl");
    }

    @PreDestroy
    public void destroyAnno() {
        logger.info("销毁前调用MyDisposalImpl的destroyAnno方法");
    }
}
