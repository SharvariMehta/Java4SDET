package ex_25_Java_Codes_1_Normal;

import java.util.Scanner;

public class Leap_Year_Calculator {
    public static void main(String[] args) {
        System.out.println("Enter year to check if its leap year or not : ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y%4 == 0)
            System.out.printf("%d is a Leap Year",y);
        else
            System.out.printf("%d is not a Leap Year !",y);
    }
}
/*
OUTPUT 1:
Enter year to check if its leap year or not :
2025
2025 is not a Leap Year !
OUTPUT 2:
Enter year to check if its leap year or not :
2016
2016 is a Leap Year
 */
