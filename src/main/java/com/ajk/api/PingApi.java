package com.ajk.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/ping")
public class PingApi {

    private static final Logger log = LoggerFactory.getLogger(PingApi.class);

    @GET
    public String get() {
        log.debug("Ping OK");
        return "Pink OK";
    }

}
