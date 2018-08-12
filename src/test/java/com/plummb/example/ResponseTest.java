/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.example.service.RestService;
import org.junit.Test;

public class ResponseTest {
  @Test(expected = RuntimeException.class)
  public void check() throws InterruptedException {
    Setup.initContext();
    RestService service = new RestService();
    service.getPerson();
  }
}
