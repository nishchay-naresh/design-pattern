package com.nishchay.dp.a02creational.factory.parse;

public class XmlParser implements Parser {

    @Override
    public String getParserType() {
        return "XmlParser";
    }

    @Override
    public void parse() {
        System.out.println("Parsing message in XML format.");
    }
}
