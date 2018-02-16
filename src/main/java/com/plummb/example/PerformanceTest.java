/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.example.service.ExpensiveService;

public class PerformanceTest {
  public void check() throws InterruptedException {
    for (int x = 0; x <= 10; x++) {
      check(x);
    }
  }

  private void check(int delay) throws InterruptedException {
    ExpensiveService service = new ExpensiveService();
    //Warming up
    service.delay(1);
    int counter = 0;
    final int millis = 10 * 1000;
    final long start = System.currentTimeMillis();
    while (System.currentTimeMillis() < start + millis) {
      service.delay(delay);
      counter++;
    }
    System.out.println((millis / 1000) + " seconds, delay " + delay + " millis, Calls " + counter + ", Average " +
        ((double) millis / counter));
  }
}
