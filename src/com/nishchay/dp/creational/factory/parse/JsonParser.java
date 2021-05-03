package com.nishchay.dp.creational.factory.parse;

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
