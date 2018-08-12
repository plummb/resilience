/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example.service;

import com.mongodb.MongoSocketReadException;
import com.plummb.example.Person;

import java.util.Random;

/**
 * Simulated Dao for accessing data from Mongo DB
 */
public class MongoDao {
  private static final Random RANDOM = new Random(System.nanoTime());

  public Person findOne(String personId) {
    if (RANDOM.nextInt(100) < 75) {
      throw new MongoSocketReadException("Exception while reading from Mongo Server", null);
    }
    return new Person(personId, 44);
  }
}
