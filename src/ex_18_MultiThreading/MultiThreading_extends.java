package ex_18_MultiThreading;

public class MultiThreading_extends {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.start();
        Worker w2 = new Worker();
        w2.start();
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
class Worker extends Thread {   //INHERITANCE CONCEPT (Abstraction)
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
main
Thread-1
Thread-0
main
Thread-0
Thread-1
main
Thread-1
Thread-0
main
Thread-1
Thread-0
Thread-0
Thread-1
main
 */