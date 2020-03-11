package main.java.com.learning.day3_multithreading.q1;

import java.util.Random;
import java.util.Scanner;

/*
 * A simple class which prints random numbers in the range 0-9 indefinitely
 * until stopped with return (Enter) key press
 * */
public class RandomNumberPrinterWithVolatile extends Thread {

    //Declaring this variable as volatile forced each read/write from main memory, this value cannot be cached.
    //Since all threads read/write from main memory, there's no inconsistency.

    volatile boolean keepPrinting = true;

    @Override
    public void run() {

        while (keepPrinting) {

            Random r = new Random();
            System.out.println(r.nextInt(10));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //Since keepPrinting is declared as volatile, this method will stop the main loop for sure.
    public void shutdown() {
        keepPrinting = false;
    }

    //A simple function which starts the main printing loop and waits for any user input to invoke shutdown()
    public static void demo()
    {
        RandomNumberPrinterWithVolatile randomNumberPrinterWithVolatile = new RandomNumberPrinterWithVolatile();
        randomNumberPrinterWithVolatile.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        randomNumberPrinterWithVolatile.shutdown();//will stop the main loop
    }
}
