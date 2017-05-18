package com.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/log")
    public String helloLog() {
        LOGGER.debug("this is a debug message");
        LOGGER.info("this is a info message");
        LOGGER.error("this is a error message");
        LOGGER.warn("this is a warn message");
        return "ok";
    }
}
