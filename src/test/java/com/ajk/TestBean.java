package com.ajk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean {

    private static final Logger log = LoggerFactory.getLogger(TestBean.class);

    public TestBean() {
        log.debug("hello - I'm a test bean");
    }

    public String sayHello() {
        return "Hello!";
    }

}
