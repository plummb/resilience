/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.example.service.MorphService;
import com.plummb.resile.client.ResilienceClient;
import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class InterceptTest {

  /**
   * Verifies that intercepting an already intercepted object returns the same object
   *
   * @throws InterruptedException If interrupted
   */
  @Test
  public void checkAlreadyIntercepted() throws InterruptedException {
    MorphService service = new MorphService();
    MorphService interceptedService = ResilienceClient.intercept("ReIntercept", service);
    assertSame(service, interceptedService);
  }

  /**
   * Verifies that intercepting a non-intercepted object returns a proxy
   *
   * @throws InterruptedException If interrupted
   */
  @Test
  public void checkIntercept() throws InterruptedException {
    InterceptTest service = new InterceptTest();
    InterceptTest interceptedService = ResilienceClient.intercept("InterceptAllowed", service);
    assertNotSame(service, interceptedService);
  }
}
