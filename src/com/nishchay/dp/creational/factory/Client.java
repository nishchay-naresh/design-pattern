package com.nishchay.dp.creational.factory;

public class Client {

    public static void main(String[] args) {
        Database currentDB = Factory.getDBConnection("MySQL");
        if (currentDB != null) {
            currentDB.connect();
        }

        Database connectingDB = Factory.getDBConnection("Cassandra");
        if (currentDB != null) {
            connectingDB.connect();
        }

//        Exception in thread "main" java.lang.IllegalArgumentException: No Such DB exists
//        Database testDB = Factory.getDBConnection("NOSQL");
    }
}
