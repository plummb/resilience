/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.resile.client.ResilienceClient;
import org.slf4j.MDC;

import java.util.UUID;

public class Setup {
  private static boolean initialized = false;

  public static TheContext initContext() throws InterruptedException {
    MDC.put("requestId", UUID.randomUUID().toString());
    TheContext context = new TheContext();
    context.setSimulationEnabled(true);
    context.setResilienceEnabled(true);
    context.setCircuitEnabled(true);
    context.setMorphEnabled(true);
    ResilienceClient.setContext(context);
    if (!initialized) {
      Thread.sleep(40000);
    }
    initialized = true;
    return context;
  }
}
