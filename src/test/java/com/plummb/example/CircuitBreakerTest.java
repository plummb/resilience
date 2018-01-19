/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.resile.client.ResilienceClient;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class CircuitBreakerTest {
  /**
   * Verify if {@link RuntimeException} with message as "Circuit Breaker" is thrown
   * Observations: When Circuit is open, a pause in logs can be seen
   * When Circuit is Half-Open, only 80% of traffic will be blocked
   * <p>
   * As this is probability based, at times this test case can fail
   *
   * @throws InterruptedException If interrupted
   */
  @Test
  public void verify() throws InterruptedException {
    //This context can be used to enable/disable features
    TheContext context = Setup.setup("Resilience");

    PlummbService service = new PlummbService();
    service = ResilienceClient.intercept("Hello", service);

    long startTime = System.currentTimeMillis();
    boolean thrown = false;
    while (true) {
      if (System.currentTimeMillis() - startTime > 1000L * 300) {
        break;
      }
      try {
        Thread.sleep(1000);
        service.exceptionPercent80();
      } catch (RuntimeException rte) {
        if (Objects.equals("Circuit Breaker", rte.getMessage())) {
          //This exception must thrown at least once.
          thrown = true;
        }
      }
    }
    assertTrue("CircuitBreakerException must be thrown", thrown);
  }
}
