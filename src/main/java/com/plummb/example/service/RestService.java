/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example.service;

import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHttpResponse;

import java.util.Random;

import static org.apache.http.HttpVersion.HTTP_1_1;

public class RestService {
  private static final Random RANDOM = new Random();

  public void methodTaking25Milis() throws InterruptedException {
    Thread.sleep(25);
  }

  public void methodTaking90Secs() throws InterruptedException {
    Thread.sleep(90 * 1000);
  }

  public HttpResponse getPerson() {
    int status = 200;
    if (RANDOM.nextInt(100) < 75) {
      status = 400;
    }
    return new BasicHttpResponse(HTTP_1_1, status, "");
  }
}
