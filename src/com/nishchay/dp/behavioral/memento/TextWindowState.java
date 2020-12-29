package com.nishchay.dp.behavioral.memento;

public class TextWindowState {

    private String text; // immutable

    public TextWindowState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}