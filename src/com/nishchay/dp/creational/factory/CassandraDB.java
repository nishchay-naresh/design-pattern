package com.nishchay.dp.creational.factory;


public class CassandraDB implements Database{
	
	public String getDBType(){
		return "Cassandra";
	}
	
	public void connect(){
		System.out.println("Cassandra DB Connection created");
	}
}