package com.nishchay.dp.creational.factory;

import com.nishchay.dp.creational.factory.parse.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class Factory {

    final static Map<String, Supplier<Parser>> map = new HashMap<>();
    static {
        map.put("xml", XmlParser::new);
        map.put("json", JsonParser::new);
        map.put("protbuff", ProtBuffParser::new);
        map.put("fixedlength", FixedLengthParser::new);
    }

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
                throw new IllegalArgumentException("No such parser exists - " + parserType);
        }
    }

    /*
    * map.get(parserType) - is returning Supplier<Parser>, wrapping it under the Optional. now it become Optional<Supplier<Parser>>
    * Them mapping Optional<Supplier<Parser>> to Optional<Parser>
    * Then extracting this Optional<Parser> by .orElseThrow()
    * */
    public static Parser createParserJava8(String parserType) {
        return Optional.ofNullable(map.get(parserType))
                .map(Supplier::get)
                .orElseThrow(() -> new IllegalArgumentException("No such parser exists : " + parserType));

        /*
        return map.getOrDefault(
                parserType,
                () -> {
                    throw new IllegalArgumentException("No such parser exists: " + parserType);
                }
        ).get();
        */
    }
}