/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.example.service.PlummbService;
import org.junit.Test;

public class ResilienceTest {
  /**
   * Verify that exception is handled due to Resilience
   * As this is probability based, at times this test case can fail
   *
   * @throws InterruptedException if interrupted
   */
  @Test
  public void verify() throws InterruptedException {
    //This context can be used to enable/disable features
    TheContext context = Setup.initContext();

    PlummbService service = new PlummbService();
    service.exceptionPercent75();
  }
}
