package com.nishchay.dp.creational.factory.parse;

public class FixedLengthParser implements Parser {

    @Override
    public String getParserType() {
        return "FixedLengthParser";
    }

    @Override
    public void parse() {
        System.out.println("Parsing message in FixedLengthFile format.");
    }

}

