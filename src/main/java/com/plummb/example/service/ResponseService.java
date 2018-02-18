/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example.service;

import com.plummb.example.Person;

public class ResponseService {
  public Person getPerson(String name, int age) {
    return new Person(name, age);
  }
}
