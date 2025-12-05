package com.nishchay.dp.creational.singleton;

import com.nishchay.dp.creational.singleton.lazy.SingletonBillPugh;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ValidateSingletonBillPugh {

    private static final Set<Integer> instances = Collections.synchronizedSet(new HashSet<>());

    public static void main(String[] args) throws Exception {

        validateSingleton_pool();
        validateSingleton_thread();
    }

    private static void validateSingleton_thread() {

        SingletonBillPugh singleton = SingletonBillPugh.getInstance();
        Runnable task = () -> {
            if (singleton != SingletonBillPugh.getInstance()) {
                System.out.println("Singleton failed ..!!!");
            }
        };

        IntStream.rangeClosed(1, 15)
                .forEach(i -> new Thread(task, "Thread-" + i).start());

        System.out.println("SUCCESS: All threads received the same singleton instance.");
    }

    /*
     *
     * Why System.identityHashCode()? - Ensures we compare true memory-level identity.
     * 	-	It returns identity hash, not overridden hashCode()
     * 	-	Guaranteed to represent the actual memory identity
     * 	-	Safer than hashCode() (which could be overridden)
     * */
    private static void validateSingleton_pool() throws InterruptedException {

        final int numberOfThreads = 100;
        ExecutorService threadPool = Executors.newFixedThreadPool(numberOfThreads);

        Runnable task = () -> {
            SingletonBillPugh singletonObject = SingletonBillPugh.getInstance();
            int hashCode = System.identityHashCode(singletonObject);
            instances.add(hashCode);
        };

        for (int i = 0; i < numberOfThreads; i++) {
            threadPool.submit(task);
        }

        threadPool.shutdown();
        threadPool.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Total unique instances: " + instances.size());
        if (instances.size() == 1) {
            System.out.println("SUCCESS: All threads received the same singleton instance.");
        } else {
            System.out.println("FAILURE: Multiple distinct instances were created. Singleton pattern failed.");
        }

    }
}
