package com.nishchay.dp.structural.delegator;

import java.util.function.UnaryOperator;

public class Launcher {

    public static void main(String[] args) {

        hardCodedEnrichmentEx();
        System.out.println("-----------------------------");
        unaryOperatorEnrichmentEx();
        System.out.println("-----------------------------");
        delegationUsingFn();
    }

    private static void hardCodedEnrichmentEx() {
        Task baseVersion = new DefaultTaskImpl();
        Task enrichedVersion = new DelegatedTask(baseVersion);
        doingTasks(enrichedVersion);
    }

    private static void doingTasks(Task enrichedVersion) {
        enrichedVersion.doTask1();
        enrichedVersion.doTask2();
    }

    private static void unaryOperatorEnrichmentEx() {
        UnaryOperator<Task> enrichmentLogic = e -> new DelegatedTask(e);
        doingEnrichmentThing(new DefaultTaskImpl(), enrichmentLogic);
    }

    /**
     * This is a generic methods, takes below two params, and then later doing the things for enriched version of object
     *
     * @param baseVersion DefaultTaskImpl
     * @param enrichmentLogic UnaryOperator<Task>
     */
    private static void doingEnrichmentThing(DefaultTaskImpl baseVersion, UnaryOperator<Task> enrichmentLogic) {
        Task enrichedVersion = enrichmentLogic.apply(baseVersion);
        doingTasks(enrichedVersion);
    }

    private static void delegationUsingFn() {
        Task delegatedTask = new DelegatedTaskFn();
        delegatedTask.doTask1();
        delegatedTask.doTask2();
    }
}
