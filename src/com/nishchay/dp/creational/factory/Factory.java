package com.nishchay.dp.creational.factory;

import com.nishchay.dp.creational.factory.parse.*;

public class Factory {

    public static Parser getParser(String parserType) {
        Parser parser = null;
        if (parserType.equalsIgnoreCase("XmlParser"))
            parser = new XmlParser();
        else if (parserType.equalsIgnoreCase("JsonParser"))
            parser = new JsonParser();
        else if (parserType.equalsIgnoreCase("FixedLengthParser"))
            parser = new FixedLengthParser();
        else if (parserType.equalsIgnoreCase("ProtBuffParser"))
            parser = new ProtBuffParser();
        else
            throw new IllegalArgumentException("No such parser exists");
        return parser;
    }

}