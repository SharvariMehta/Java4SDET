package ex_18_MultiThreading;

public class MultiThreading_miliWaiting {
    public static void main(String[] args) {
        miliwait mw = new miliwait();
        mw.timedWaitingThread();
    }
    static class miliwait {
        synchronized void timedWaitingThread() {
            System.out.println(Thread.currentThread().getName() + " is waiting for 3 seconds...");
            try {
                wait(3000);  // Wait for 3 seconds or until notified
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " resumed after timeout or notification");
        }
    }
}
/*
OUTPUT:
main is waiting for 3 seconds...
main resumed after timeout or notification
 */