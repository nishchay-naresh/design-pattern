package com.nishchay.dp.behavioral.memento;

public class Client {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor(new TextWindow());

        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();
        System.out.println("--------------------snapshot data ------------------------");
        System.out.println(textEditor.print());

        textEditor.write("Adding more text\n");
        textEditor.write("but not saving it\n");
        textEditor.write("doing a revert\n");

        System.out.println("--------------------reverted data ------------------------");
        System.out.println(textEditor.print());

        textEditor.hitUndo();

        System.out.println("--------------------data post undo ------------------------");
        System.out.println(textEditor.print());

    }
}
