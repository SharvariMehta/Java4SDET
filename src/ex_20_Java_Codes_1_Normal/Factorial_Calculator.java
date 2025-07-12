package ex_20_Java_Codes_1_Normal;

import java.util.Scanner;

public class Factorial_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to calculate its Factorial : ");
        int n = sc.nextInt();
        int factorial = 1;
        if (n == 0)
        {
            System.out.printf("Factorial of %d is %d: ",n,1 );
        }
        else
        {
            for(int i=1; i<=n; i++)
            {
                factorial = factorial*i;
            }
        }
        System.out.printf("Factorial of %d is %d: ",n,factorial );
    }
}
/*
OUTPUT:
Enter a Number to calculate its Factorial : 6
Factorial of 6 is 720:
 */