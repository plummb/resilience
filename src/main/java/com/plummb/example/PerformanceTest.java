/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.example.service.PerformanceService;

public class PerformanceTest {
  public void check() throws InterruptedException {
    for (int x = 0; x <= 10; x++) {
      check(x);
    }
  }

  private void check(int delay) throws InterruptedException {
    PerformanceService service = new PerformanceService();
    //Warming up
    service.delay(1);
    int counter = 0;
    final int millis = 10 * 1000;
    final long endsAt = System.currentTimeMillis() + millis;
    while (System.currentTimeMillis() < endsAt) {
      service.delay(delay);
      counter++;
    }
    System.out.println((millis / 1000) + " seconds, delay " + delay + " millis, Calls " + counter + ", Average " +
        ((double) millis / counter));
  }
}
