/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.resile.client.ResilienceClient;
import org.junit.Test;

public class ExpensiveServiceTest {

  /**
   * Verify method time is emitted or not
   *
   * @throws InterruptedException If interrupted
   */
  @Test
  public void check() throws InterruptedException {
    Setup.setup("Expensive");
    ExpensiveService service = new ExpensiveService();
    service = ResilienceClient.intercept("ExpensiveService", service);
    service.delay(25);
    //The time taken will be emitted in the logs starting with ML (Method Logging)

    service.delay(90000);
    //The time taken will be emitted in the logs starting with PML (Pending Method Logging). After 60 seconds, this will be emitted every ~10 seconds.
  }
}
