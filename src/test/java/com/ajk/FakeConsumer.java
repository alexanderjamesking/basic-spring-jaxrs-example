package com.ajk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FakeConsumer {

    private static final Logger log = LoggerFactory.getLogger(FakeConsumer.class);

    public FakeConsumer() {
        log.debug("fake consumer created");
    }

}
