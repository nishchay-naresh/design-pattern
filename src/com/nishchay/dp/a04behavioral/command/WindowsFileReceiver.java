package com.nishchay.dp.a04behavioral.command;

public class WindowsFileReceiver implements IReceiver {

    @Override
    public void openFile() {
        System.out.println("Windows open file");

    }

    @Override
    public void closeFile() {
        System.out.println("Windows close file");

    }

}