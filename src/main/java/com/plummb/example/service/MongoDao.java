/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example.service;

import com.mongodb.MongoException;
import com.plummb.example.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Simulated Dao for accessing data from Mongo DB
 */
public class MongoDao {
  private static final Logger LOGGER = LoggerFactory.getLogger(MongoDao.class);
  private static final Random RANDOM = new Random(System.nanoTime());

  public Person findOne(String personId) {
    if (RANDOM.nextInt(100) < 75) {
      throw new MongoException("Exception while reading from Mongo Server");
    }
    return new Person(personId, 44);
  }
}
