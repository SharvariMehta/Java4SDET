package ex_20_Java_Codes_1_Normal;

import java.util.Scanner;

public class String_Reverse_Using_SB {
    public static void main(String[] args) {
        System.out.print("Enter a String to Reverse : ");
        Scanner sc = new Scanner(System.in);
        String o = sc.nextLine();
        String r = sbreverse(o);
        System.out.println("Reversed String is : "+r);
    }
    public static String sbreverse(String o)
    {
        StringBuilder sbd = new StringBuilder(o);
        return sbd.reverse().toString();
    }
}
/*
OUTPUT:
Enter a String to Reverse : SharvariMehta
Reversed String is : atheMiravrahS
*/