package ex_18_MultiThreading;

public class MultiThreading_nanoWaiting {
    public static void main(String[] args) {
        nanowait nw = new nanowait();
        nw.nanoWaitingThread();
    }
    static class nanowait {
        synchronized void nanoWaitingThread() {
            System.out.println(Thread.currentThread().getName() + " is waiting for : 2000ms+5000nanoseconds...");
            try {
                wait(2000, 5000);  // Wait for 2000ms + 5000 nanoseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " resumed after nano wait");
        }
    }
}
/*
OUTPUT:
main is waiting for : 2000ms+5000nanoseconds...
main resumed after nano wait
 */