package com.nishchay.dp.creational.factory;

import com.nishchay.dp.creational.factory.parse.Parser;

public class Client {

    public static void main(String[] args) {
        legacyWay();
        System.out.println("--------------------------------");
        lambdaWay();
    }

    private static void legacyWay() {
        Parser xmlParser = Factory.createParser("xml");
        xmlParser.parse();

        Parser jsonParser = Factory.createParser("json");
        jsonParser.parse();

        Parser protBuffParser = Factory.createParser("protbuff");
        protBuffParser.parse();

        Parser fixedLengthParser = Factory.createParser("fixedlength");
        fixedLengthParser.parse();

        // Exception in thread "main" java.lang.IllegalArgumentException: No such parser exists
        // Parser unknownParser = Factory.createParser("unknown");
        // unknownParser.parse();
    }

    private static void lambdaWay() {
        Parser xmlParser = Factory.createParserJava8("xml");
        xmlParser.parse();

        Parser jsonParser = Factory.createParserJava8("json");
        jsonParser.parse();

        Parser protBuffParser = Factory.createParserJava8("protbuff");
        protBuffParser.parse();

        Parser fixedLengthParser = Factory.createParserJava8("fixedlength");
        fixedLengthParser.parse();

        // Exception in thread "main" java.lang.IllegalArgumentException: No such parser exists
        // Parser unknownParser = Factory.createParser("unknown");
        // unknownParser.parse();
    }
}
