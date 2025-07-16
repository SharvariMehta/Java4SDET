package ex_05_Arrays;

import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        int[] n = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in Array below : ");
        for(i=0; i<n.length; i++)
        {
            n[i] = sc.nextInt();            //Take Input
        }
        System.out.print("Elements in Array are : ");
        for(i=0; i<n.length; i++)
        {
            System.out.print(n[i]+" ");     //Print Output
        }
    }
}
/*
OUTPUT:
Enter elements in Array below :
1
2
3
4
5
Elements in Array are : 1 2 3 4 5
 */
