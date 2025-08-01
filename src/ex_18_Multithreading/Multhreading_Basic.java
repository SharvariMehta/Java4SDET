package ex_18_Multithreading;

public class Multhreading_Basic {
    public static void main(String[] args)  throws InterruptedException{
        Thread t = new Thread();
        System.out.println(t);
        for(int i=0; i<2; i++) {
            System.out.println(i+" "+t.getName());
            System.out.println(i+" "+t.getPriority());
        }
    }
}
