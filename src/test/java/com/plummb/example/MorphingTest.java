/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

import com.plummb.example.service.MorphService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    MorphService service = new MorphService();
    try {
      context.setMorphEnabled(true);
      service.exception("Exception is thrown");
    } catch (Exception e) {
      assertEquals("Exception is thrown", e.getMessage());
      //This will emit "Exception is thrown"
    }

    try {
      context.setMorphEnabled(false);
      service.exception("Password abc is incorrect");
    } catch (Exception e) {
      assertEquals("Password abc is incorrect", e.getMessage());
      //This will emit "Password abc is incorrect", as morphing is disabled
    }

    try {
      context.setMorphEnabled(true);
      service.exception("Password abc is incorrect");
    } catch (Exception e) {
      assertEquals("Check the credentials", e.getMessage());
      //This will emit "Check the credentials", as morphing is enabled
    }
    Thread.sleep(20000);
  }
}
