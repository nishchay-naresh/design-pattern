package com.nishchay.dp.a02creational.factory.parse;

public class JsonParser implements Parser {

    @Override
    public String getParserType() {
        return "JsonParser";
    }

    @Override
    public void parse() {
        System.out.println("Parsing message in JSON format.");
    }
}
