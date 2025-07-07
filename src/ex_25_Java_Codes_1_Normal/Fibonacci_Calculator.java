package ex_25_Java_Codes_1_Normal;

import java.util.Scanner;

public class Fibonacci_Calculator {
    public static void main(String[] args) {
    int i = 0;
    int j = 1;
        System.out.println(i);
        System.out.println(j);


        while(i<100)
        {
            int t = i + j;
            System.out.println(t);
            i = i + j;
        }



    }
}
