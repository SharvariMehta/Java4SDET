package ex_18_Multithreading;

public class Multithreading_extends {    // It demonstrates how two threads can run independently:
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

// start(): Starts the thread. It internally calls run() in a new thread
        t1.start(); // Start thread 1
        t2.start(); // Start thread 2
    }
    static class MyThread extends Thread {  // MyThread extends Thread: We create a new class that extends Thread.
        public void run() {                 // run() method: This is where the thread’s work is defined.
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                try {
// sleep(500): Causes the thread to pause for 500 milliseconds to simulate some work.
                    Thread.sleep(500); // Pause for 0.5 seconds
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
/*
OUTPUT:
Thread 1 - Count: 1
Thread 2 - Count: 1
Thread 2 - Count: 2
Thread 1 - Count: 2
Thread 1 - Count: 3
Thread 2 - Count: 3
Thread 1 - Count: 4
Thread 2 - Count: 4
Thread 1 - Count: 5
Thread 2 - Count: 5
 */


