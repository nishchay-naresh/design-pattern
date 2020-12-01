package com.nishchay.dp.structural.proxy;

public class Client
{
    public static void main(String[] args) 
    {
        // creating an proxy object for an real object (which does some functionality)
        // client is invoking real object functionality over proxy object, which in turn gets executed by real Object

        RealObject proxy = new RealObjectProxy();
        proxy.doSomething();
    }
}