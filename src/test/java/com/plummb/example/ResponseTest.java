/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.example.service.ResponseService;
import org.junit.After;
import org.junit.Test;

public class ResponseTest {
  @Test(expected = RuntimeException.class)
  public void check() throws InterruptedException {
    Setup.initContext();
    ResponseService service = new ResponseService();
    service.getPerson("FooBar", 16);
  }
  @After
  public void after() throws InterruptedException {
    Thread.sleep(20000);
  }
}
