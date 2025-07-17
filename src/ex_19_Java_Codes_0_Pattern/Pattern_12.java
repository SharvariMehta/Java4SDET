package ex_19_Java_Codes_0_Pattern;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for number of Rows in Pattern : ");
        int n = sc.nextInt();
        for(int i=1; i<n; i++)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int j = 0; j<i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
/*
OUTPUT:
     *
    * *
   * * *
  * * * *
 * * * * *
 */