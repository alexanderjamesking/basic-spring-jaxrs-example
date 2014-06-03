package com.ajk;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:integration-test-config.xml")
public class SampleIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(SampleIntegrationTest.class);

    @Autowired
    private TestBean testBean;

    @Before
    public void before() {
        log.debug("before");
    }

    @After
    public void after() {
        log.debug("after");
    }

    @Test
    public void testSomething() {
        log.debug("test something");
        assertEquals("Hello!", testBean.sayHello());
    }

    @Test
    public void testSomethingElse() {
        log.debug("test something else");
        assertEquals("Hello!", testBean.sayHello());
    }
}
