/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.resile.client.ResilienceClient;
import org.slf4j.MDC;

import java.util.UUID;

public class Setup {
  public static ThreadLocalContext initContext() throws InterruptedException {
    MDC.put("requestId", UUID.randomUUID().toString());
    ThreadLocalContext context = new ThreadLocalContext();
    context.setSimulationEnabled(true);
    context.setResilienceEnabled(true);
    context.setCircuitEnabled(true);
    context.setMorphEnabled(true);
    ThreadLocalContext.setContext(context);

    //This call is not needed. This is just to save time during demo.
    ResilienceClient.synchronizeIfNever();

    return context;
  }
}
