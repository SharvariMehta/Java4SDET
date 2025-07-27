package ex_16_Exception_Handling;

import java.util.Scanner;

public class try_catch_finally_ex {
    public static void main(String[] args) {
        System.out.println("Enter number you want to divide by 100 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        try {
            k = 100/n;
        } catch (Exception e) {
            System.out.print("Catch Block : ");
            System.out.println("Exception Reason : "+e.getMessage());
        } finally {
            sc.close();
            System.out.print("Finally Block : ");
            System.out.println("Scanner Closed. Program execution ends.");
        }
        System.out.printf("100 divided by %d is : ",n);
        System.out.print(k);
    }
}
/*
OUTPUT when input is 0 :
Enter number you want to divide by 100 :
0
Catch Block : Exception Reason : / by zero
Finally Block : Scanner Closed. Program execution ends.
100 divided by 0 is : 0
Process finished with exit code 0

OUTPUT when input is 10 :
Enter number you want to divide by 100 :
10
Finally Block : Scanner Closed. Program execution ends.
100 divided by 10 is : 10
Process finished with exit code 0
*/
