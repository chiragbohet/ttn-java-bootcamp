package main.java.com.learning.day3_multithreading.q2;

//Q2. Write a program to create a thread using Thread class and Runnable interface each.

/*
 * Main Driver class which
 * actually spawns the two threads.
 */
public class Driver {
    public static void main(String[] args) {

        threadUsingClass t1 = new threadUsingClass();

        threadUsingInterface threadUsingInterface = new threadUsingInterface();
        Thread t2 = new Thread(threadUsingInterface);

        //Directly implementing Runnable interface
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This thread is created by directly implementing Runnable interface!");
            }
        });


        t1.start();
        t2.start();
        t3.start();

    }
}


/*
 * A simple class which inherits from Thread class
 * and overrides run() method.
 * */
class threadUsingClass extends Thread {
    @Override
    public void run() {
        System.out.println("This thread is created extending Thread class!");
    }
}


/* A simple class which implements Runnable interface
 * and overrides its run() method.
 *  */
class threadUsingInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("This thread is created by implementing Runnable interface!");
    }
}