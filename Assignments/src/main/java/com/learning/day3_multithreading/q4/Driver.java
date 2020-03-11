package main.java.com.learning.day3_multithreading.q4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
    public static void main(String[] args) {
        ExecutorService worker = Executors.newFixedThreadPool(2);

        final int LIMIT = 100;

        Thread printOdd = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < LIMIT; i++) {
                    if (i % 2 != 0)
                        System.out.println(i);


                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread printEven = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < LIMIT; i++) {
                    if (i % 2 == 0)
                        System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        worker.submit(printEven);
        worker.submit(printOdd);

        worker.shutdown();
    }
}
