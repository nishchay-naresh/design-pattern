package com.nishchay.dp.creational.factory.parse;


public class ProtBuffParser implements Parser {

    @Override
    public String getParserType() {
        return "ProtBuffParser";
    }

    @Override
    public void parse() {
        System.out.println("Parsing message in Protocol Buffers format.");
    }
}