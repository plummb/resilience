/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.example.service.RestService;
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
    RestService service = new RestService();
    System.out.println("The time taken will be emitted in the logs starting with ML (Method Logging)");
    service.methodTaking25Milis();

    System.out.println("The time taken will be emitted in the logs starting with PML (Pending Method Logging).");
    System.out.println("After 60 seconds, this will be emitted every ~10 seconds.");
    service.methodTaking90Secs();
  }
}
