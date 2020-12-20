package com.nishchay.dp.behavioral.command;

public class Client {

    public static void main(String[] args) {

        /*
        *
        Flow will be like that =>
            1.	create a concrete command object
            2.	set its receiver in it (means its processor)
            3.	set this concrete command object to invoker
            4.	then do invoker.execute()
        * */
        IReceiver receiver = new WindowsFileReceiver();
        ICommand command = new OpenCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.execute();

        receiver = new UnixFileReceiver();
        command = new OpenCommand(receiver);
        invoker = new Invoker(command);
        invoker.execute();

        receiver = new UnixFileReceiver();
        command = new CloseCommand(receiver);
        invoker = new Invoker(command);
        invoker.execute();


    }
}