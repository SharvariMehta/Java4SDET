package ex_20_Java_Codes_1_Normal;

import java.util.Scanner;

public class Prime_Number_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its Prime or Not : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++)
        {
            if(n%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }

}
/*
OUTPUT 1:
Enter a number to check if its Prime or Not :
17
17 is a prime number.
OUTPUT 2:
Enter a number to check if its Prime or Not :
77
77 is not a prime number.
 */