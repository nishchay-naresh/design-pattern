package com.nishchay.dp.structural.delegator;

public class Launcher {

    public static void main(String... args) {

        Task baseVersion = new DefaultTaskImpl();
        Task enrichedVersion = new DelegatedTask(baseVersion);
        enrichedVersion.doTask1();
        enrichedVersion.doTask2();

    }
}
