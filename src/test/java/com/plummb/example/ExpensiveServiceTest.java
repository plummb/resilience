/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.example.service.ExpensiveService;
import org.junit.Test;

public class ExpensiveServiceTest {

  /**
   * Verify method time is emitted or not
   *
   * @throws InterruptedException If interrupted
   */
  @Test
  public void check() throws InterruptedException {
    Setup.initContext();
    ExpensiveService service = new ExpensiveService();
    System.out.println("The time taken will be emitted in the logs starting with ML (Method Logging)");
    service.delay(25);

    System.out.println("The time taken will be emitted in the logs starting with PML (Pending Method Logging). After 60 seconds, this will be emitted every ~10 seconds.");
    service.delay(90000);
  }
}
