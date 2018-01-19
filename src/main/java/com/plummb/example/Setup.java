/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.resile.client.ResilienceClient;

public class Setup {
  private static boolean initialized = false;

  public static TheContext setup(String type) throws InterruptedException {
    ResilienceClient.enable("1d968432-6eba-42b4-8903-05a7d0b48ed9", type);
    TheContext context = new TheContext();
    context.setSimulationEnabled(true);
    context.setResilienceEnabled(true);
    context.setCircuitEnabled(true);
    context.setMorphEnabled(true);
    ResilienceClient.setContext(context);
    if (!initialized) {
      Thread.sleep(20000);
    }
    initialized = true;
    return context;
  }
}
