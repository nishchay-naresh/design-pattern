package com.nishchay.dp.creational.factory;

import com.nishchay.dp.creational.factory.parse.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Factory {

    public static Parser createParser(String parserType) {

        switch (parserType) {
            case "xml":
                return new XmlParser();
            case "json":
                return new JsonParser();
            case "protbuff":
                return new ProtBuffParser();
            case "fixedlength":
                return new FixedLengthParser();
            default:
                throw new IllegalArgumentException("No such parser exists" + parserType);
        }
    }

    final static Map<String, Supplier<Parser>> map = new HashMap<>();
    static {
        map.put("xml", XmlParser::new);
        map.put("json", JsonParser::new);
        map.put("protbuff", ProtBuffParser::new);
        map.put("fixedlength", FixedLengthParser::new);
    }
    public static Parser createParserJava8(String parserType) {
        Supplier<Parser> parserSupplier = map.get(parserType);
        if(parserSupplier != null)
            return parserSupplier.get();
        throw new IllegalArgumentException("No such parser exists" + parserType);
    }
}