package com.example.reactorstudy.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Slf4j
public class MyLogger {
  public void myMethod() {
    log.error("This is an error message.");
    log.warn("This is a warning message.");
    log.info("This is an information message.");
    log.debug("This is a debug message.");
  }
}