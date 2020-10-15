package com.nishchay.dp.creational.factory;

public class Factory {

	public static Database getDBConnection(String dbType){

		if(dbType.equalsIgnoreCase("Cassandra"))
			return new CassandraDB();
		else if (dbType.equalsIgnoreCase("MySql"))
			return new MySqlDB();
		else
			throw new IllegalArgumentException("No Such DB exists");
	}
	
}