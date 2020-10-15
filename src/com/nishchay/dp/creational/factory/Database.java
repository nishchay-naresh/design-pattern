package com.nishchay.dp.creational.factory;

// MySQL & Cassandra
public interface Database {

  String getDBType();
  void connect();

}