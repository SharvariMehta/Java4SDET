package ex_18_MultiThreading;

public class Thread_DeadLock {
    public static void main(String[] args) {
    final String resource1 = "ATB";
    final String resource2 = "MTB";
    // t1 tries to lock resource1 then resource2
    Thread t1 = new Thread() {
        public void run() {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        }
    };
    // t2 tries to lock resource2 then resource1
    Thread t2 = new Thread() {
        public void run() {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        }
    };
    t1.start();
    t2.start();
    }
    private class Resource1 {
        private int i = 10;
        public int getI() { return i;}
        public int setI(int i) { return this.i = i; }
    }
    private class Resource2 {
        private int i = 20;
        public int getI() { return i;}
        public int setI(int i) { return this.i = i; }
    }
}
/*
OUTPUT: without creating separate classes :
Thread 1: locked resource 1
Thread 2: locked resource 2
OUTPUT: with separate classes:
Thread 2: locked resource 2
Thread 1: locked resource 1
 */
