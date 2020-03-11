package main.java.com.learning.day3_multithreading.q1;

import java.util.Random;
import java.util.Scanner;

/*
* A simple class which prints random numbers in the range 0-9 indefinitely
* until stopped with return (Enter) key press
* */
public class RandomNumberPrinterWithoutVolatile extends Thread{

    // Since this variable is not declared as volatile a thread might cache its value in the registers
    // If the value is cached in the register essentially means that this  variable stays in isolation, unaffected by other threads read/write operations which results in inconsistency.
    boolean keepPrinting = true;

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

    // Since the variable keepPrinting is not volatile invoking this method
    // does not guarantee that any change in value will be read by the other thread
    // hence this method will not always stop the main printing loop.
    public void shutdown() {
        keepPrinting = false;
    }

    //A simple function which starts the main printing loop and waits for any user input to invoke shutdown()
    public static void demo()
    {
        RandomNumberPrinterWithoutVolatile randomNumberPrinterWithoutVolatile = new RandomNumberPrinterWithoutVolatile();
        randomNumberPrinterWithoutVolatile.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        randomNumberPrinterWithoutVolatile.shutdown();//Might not always work
    }
}
