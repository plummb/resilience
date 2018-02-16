/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import org.junit.Test;

public class PlummbEnabledTest {
  @Test
  public void check() throws InterruptedException {
    Setup.initContext();
    new PerformanceTest().check();
  }
}
