package ex_18_MultiThreading;

public class MultiThreading_LocalThread {
    private static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);
    public static void main(String[] args) {
        Runnable task = () -> {
            int value = (int) (Math.random() * 100);
            threadLocalValue.set(value);  // Set value unique to this thread
            System.out.println(Thread.currentThread().getName() + " has ThreadLocal value: " + threadLocalValue.get());
        };
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        t1.start();
        t2.start();
    }
}
/*
OUTPUT:
Thread-1 has ThreadLocal value: 33
Thread-2 has ThreadLocal value: 46
 */