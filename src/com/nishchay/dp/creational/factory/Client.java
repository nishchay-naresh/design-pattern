package com.nishchay.dp.creational.factory;

import com.nishchay.dp.creational.factory.parse.Parser;

public class Client {

    public static void main(String[] args) {

        Parser xmlParser = Factory.getParser("XmlParser");
        if (xmlParser != null) {
            xmlParser.parse();
        }

        Parser jsonParser = Factory.getParser("JsonParser");
        if (jsonParser != null) {
            jsonParser.parse();
        }

        Parser protBuffParser = Factory.getParser("ProtBuffParser");
        if (protBuffParser != null) {
            protBuffParser.parse();
        }

        Parser fixedLengthParser = Factory.getParser("FixedLengthParser");
        if (fixedLengthParser != null) {
            fixedLengthParser.parse();
        }

//        Parser abcParser = Factory.getParser("UnknownParser");
//        abcParser.parse();
//        Exception in thread "main" java.lang.IllegalArgumentException: No Such DB exists
//        Database testDB = Factory.getDBConnection("NOSQL");
    }
}
