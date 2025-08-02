package ex_18_MultiThreading;

public class MultiThreading_Wait_Notify {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(() -> resource.waitingThread(), "Thread-1");
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);  // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.notifyingThread();
        }, "Thread-2");
        t1.start();
        t2.start();
    }
}
class SharedResource {
    synchronized void waitingThread() {
        System.out.println(Thread.currentThread().getName() + " is waiting...");
        try {
            wait();  // Causes the current thread to wait until it is notified.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " resumed after notification");
    }
    synchronized void notifyingThread() {
        System.out.println(Thread.currentThread().getName() + " is notifying...");
        notify();  // Notifies one waiting thread.
    }
}
/*
OUTPUT:
Thread-1 is waiting...
Thread-2 is notifying...
Thread-1 resumed after notification
 */