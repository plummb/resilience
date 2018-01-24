/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example.service;

public class MorphService {
  public void exception(String message) throws InterruptedException {
    throw new RuntimeException(message);
  }
}
