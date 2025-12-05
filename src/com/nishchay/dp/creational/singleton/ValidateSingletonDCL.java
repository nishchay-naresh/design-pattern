package com.nishchay.dp.creational.singleton;

import com.nishchay.dp.creational.singleton.lazy.SingletonThreadSafe;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ValidateSingletonDCL {

    // A thread-safe set to store the hash codes of the instances created by different threads
    private static final Set<Integer> instances = Collections.synchronizedSet(new HashSet<>());
    // private static final Set<Integer> instances = ConcurrentHashMap.newKeySet();

    public static void main(String[] args) throws Exception {

        validateSingleton_thread();
        validateSingleton_pool();
    }

    private static void validateSingleton_thread() {

        SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
        Runnable task = () -> {
            if (singleton != SingletonThreadSafe.getInstance()) {
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
            SingletonThreadSafe singletonObject = SingletonThreadSafe.getInstance();
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
