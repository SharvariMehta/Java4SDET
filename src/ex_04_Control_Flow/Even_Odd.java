package ex_04_Control_Flow;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
