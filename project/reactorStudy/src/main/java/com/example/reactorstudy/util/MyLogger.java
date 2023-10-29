package com.example.reactorstudy.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLogger {
  private static final Logger logger = LogManager.getLogger(MyLogger.class);

  public static void main(String[] args) {
    logger.error("This is an error message.");
    logger.warn("This is a warning message.");
    logger.info("This is an information message.");
    logger.debug("This is a debug message.");
  }
}