package ex_18_Multithreading;

public class Multithreading_Basic {    // It demonstrates how two threads can run independently:
    public static void main(String[] args) {
        Thread t = new Thread();
        for(int i=0; i<5; i++)
        {
            System.out.println(t.getName()+" - "
                    +i+" - "
                    +t.getThreadGroup()+" - "
                    +t.getPriority());
        }
    }
}
/*
OUTPUT:
Thread-0 - 0 - java.lang.ThreadGroup[name=main,maxpri=10] - 5
Thread-0 - 1 - java.lang.ThreadGroup[name=main,maxpri=10] - 5
Thread-0 - 2 - java.lang.ThreadGroup[name=main,maxpri=10] - 5
Thread-0 - 3 - java.lang.ThreadGroup[name=main,maxpri=10] - 5
Thread-0 - 4 - java.lang.ThreadGroup[name=main,maxpri=10] - 5
 */