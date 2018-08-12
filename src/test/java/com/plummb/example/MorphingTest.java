/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.example.service.PostgresService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MorphingTest {

  /**
   * Verify that the password is morphed
   * Pattern to match: "Password .* is incorrect"
   * Replace with: "Check the credentials"
   *
   * @throws InterruptedException If interrupted
   */
  @Test
  public void check() throws InterruptedException {
    ThreadLocalContext context = Setup.initContext();
    PostgresService service = new PostgresService();
    try {
      context.setMorphEnabled(false);
      service.getConnection();
    } catch (Exception e) {
      assertTrue(e.getMessage(), e.getMessage().matches(".*Connection to .* refused.*"));
      //This will emit "Password abc is incorrect", as morphing is disabled
    }

    try {
      context.setMorphEnabled(true);
      service.getConnection();
    } catch (Exception e) {
      assertEquals("Check the host/IP of the connection", e.getMessage());
      //This will emit "Check the credentials", as morphing is enabled
    }
  }
}
