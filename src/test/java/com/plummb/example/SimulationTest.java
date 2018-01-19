/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.resile.client.ResilienceClient;
import org.junit.Test;

public class SimulationTest {
  /**
   * Verify that an Exception is thrown.
   * As this is probability based, at times this test case can fail
   *
   * @throws InterruptedException if interrupted
   */
  @Test(expected = RuntimeException.class)
  public void verify() throws InterruptedException {
    //This context can be used to enable/disable features
    TheContext context = Setup.setup("Simulation");

    PlummbService service = new PlummbService();
    service = ResilienceClient.intercept("Hello", service);

    for (int x = 0; x < 20; x++) {
      Thread.sleep(1000);
      service.delaySeconds2();
      service.exceptionPercent10();
    }
  }
}
