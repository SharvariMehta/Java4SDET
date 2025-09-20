package SDETQA;

import java.util.Scanner;

public class Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer Number : ");
        int num = sc.nextInt();
        int rev = 0;
        while(num!=0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse Number is : "+rev);
    }
}
/*
Enter an integer Number :
1234
Reverse Number is : 4321
 */