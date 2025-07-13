package ex_20_Java_Codes_1_Normal;

import java.util.Scanner;

public class String_Reverse_WoFunction {
    public static void main(String[] args) {
        System.out.print("Enter a String to Reverse : ");
        Scanner sc = new Scanner(System.in);
        String o = sc.nextLine();

        String r = "";
        for(int i = o.length()-1; i>=0; i--)
        {
            r = r + o.charAt(i);
        }
        System.out.println("Reversed String is : "+ r);
    }
}
/*
OUTPUT:
Enter a String to Reverse : Sharvari
Reversed String is : iravrahS
 */