package ex_01_Java_Basics;

public class MAXNumberViaConsole {
    public static void main(String[] args) {
        String a1 = args[0];
        String a2 = args[1];
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(a2);
        int maxnum = (a>b)? a : b ;
        System.out.println("Maximum Number is: "+maxnum);
    }
}
/*
Maximum Number is: 20
 */