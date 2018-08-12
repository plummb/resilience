/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresService {

  public Connection getConnection() throws SQLException {
    return DriverManager
        .getConnection("jdbc:postgresql://ec2-54-83-33-213.compute-1.amazonaws.com:5431/db?sslmode=require");
  }
}
