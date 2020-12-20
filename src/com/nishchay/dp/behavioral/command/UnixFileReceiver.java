package com.nishchay.dp.behavioral.command;

public class UnixFileReceiver implements IReceiver {

    @Override
    public void openFile() {
        System.out.println("Unix open file");
    }

    @Override
    public void closeFile() {
        System.out.println("Unix close file");
    }

}