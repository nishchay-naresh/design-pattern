package com.nishchay.dp.creational.factory;

public class MySqlDB implements Database {

    public String getDBType() {
        return "MySQL";
    }

    public void connect() {
        System.out.println("MySQL DB Connection created");
    }
}
