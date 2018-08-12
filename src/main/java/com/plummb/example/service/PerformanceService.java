/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example.service;

public class PerformanceService {
  public void delay(long millis) throws InterruptedException {
    Thread.sleep(millis);
  }
}
