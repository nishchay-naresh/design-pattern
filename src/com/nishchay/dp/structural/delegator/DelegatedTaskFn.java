package com.nishchay.dp.structural.delegator;


import java.util.function.Consumer;

/*
 * when you want to perform some additional actions before/after you delegate
 * (that's the Decorator pattern, but it's based on delegation).
 *  For example, Collections.synchronizedList(..)
 *
 * */
public class DelegatedTaskFn implements Task {

    @Override
    public void doTask1() {
        doDelegation(e -> e.doTask2());
    }

    @Override
    public void doTask2() {
        doDelegation(e -> e.doTask2());
    }

    /*
     *
     * Since these methods (doTask1(), doTask2()) is not returning any value - Consumer<T> : T -> void
     * If these methods would have returned any value then we have to use - Consumer<T,R>  : T -> R
     * */
    public void doDelegation(Consumer<Task> taskConsumer) {
        Task task = new DefaultTaskImpl();
        taskConsumer.accept(task);
        System.out.println("Extra things from Delegator");
    }
}
