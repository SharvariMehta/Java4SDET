package ex_18_MultiThreading;

public class MultiThreading_runnable {
    public static void main(String[] args) {
        Workers w1 = new Workers();
        Thread t1 = new Thread(w1);
        t1.start();
        Workers w2 = new Workers();
        Thread t2 = new Thread(w2);
        t2.start();
    }
}
class Workers implements Runnable {     // INTERFACE CONCEPT
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
/*
OUTPUT:
Thread-1
Thread-0
Thread-0
Thread-1
Thread-0
Thread-1
Thread-0
Thread-1
Thread-0
Thread-1
 */