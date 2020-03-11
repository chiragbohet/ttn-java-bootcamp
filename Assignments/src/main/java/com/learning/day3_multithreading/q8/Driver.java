package main.java.com.learning.day3_multithreading.q8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i=0; i < 200; i++) {
            executor.submit(new Runnable() {
                public void run() {
                    Connection.getInstance().connect();
                }
            });
        }

        executor.shutdown();

        executor.awaitTermination(1, TimeUnit.DAYS);
    }

}
