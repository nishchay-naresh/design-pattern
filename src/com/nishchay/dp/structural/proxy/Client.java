package com.nishchay.dp.structural.proxy;

public class Client
{
    public static void main(String[] args) 
    {
        // creating an proxy object and invoking th functionality over it only. which in turn gets executed by real Object
        RealObject proxy = new RealObjectProxy();
        proxy.doSomething();
    }
}