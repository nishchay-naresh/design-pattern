package com.nishchay.dp.structural.delegator;

public class DefaultTaskImpl implements Task{
    @Override
    public void doTask1() {
        System.out.println("DefaultTaskImpl#task1");
    }

    @Override
    public void doTask2() {
        System.out.println("DefaultTaskImpl#task2");
    }
}
