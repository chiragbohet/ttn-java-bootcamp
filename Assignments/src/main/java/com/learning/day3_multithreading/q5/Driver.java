package main.java.com.learning.day3_multithreading.q5;

public class Driver{
    public static void main(String[] args) throws InterruptedException {

        final Processor processor = new Processor();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    processor.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    processor.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
