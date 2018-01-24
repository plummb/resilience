/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main service for verification.
 */
public class PlummbService {
  private static final Logger LOGGER = LoggerFactory.getLogger(PlummbService.class);

  /**
   * Simulation throws {@link RuntimeException} 1 in 10 calls.
   */
  public void exceptionPercent10() {
    LOGGER.info("Called Method : exceptionPercent10");
  }

  /**
   * Simulation adds a delay of 2 Seconds.
   */
  public void delaySeconds2() {
    LOGGER.info("Called Method : delaySeconds2");
  }

  /**
   * Simulation throws {@link RuntimeException} 3 in 4 calls.
   * Resilience Rule retries for 10 time with a delay of 1 second each.
   */
  public void exceptionPercent75() {
    LOGGER.info("Called Method : exceptionPercent75");
  }

  /**
   * Simulation throws {@link RuntimeException} 4 in 5 calls.
   * Circuit Breaker configured Period 60 Seconds, >60% Open, >40% Half-Open, throws {@link RuntimeException}("Circuit Breaker")
   */
  public void exceptionPercent80() {
    LOGGER.info("Called Method : exceptionPercent80");
  }
}
