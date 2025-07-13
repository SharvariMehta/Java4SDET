package ex_20_Java_Codes_1_Normal;

import java.util.Scanner;

public class Palindrome_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String you want to check its palindrome or Not : ");
        String original = sc.nextLine();
        String newString = reverseString(original);

        if(newString.equalsIgnoreCase(original))
        {
            System.out.println("It is a Palindrome !");
        }
        else
        {
            System.out.println("Its not a Palindrome !");
        }

    }
    public static String reverseString(String original)
    {
        String reversedString = "";
        for(int i = original.length()-1; i>=0; i--)
        {
            reversedString = reversedString + original.charAt(i);
        }
        return reversedString;
    }
}
/*
OUTPUT 1:
Enter a String you want to check its palindrome or Not :
MADAM
It is a Palindrome !
OUTPUT 2:
Enter a String you want to check its palindrome or Not :
QWERTy
Its not a Palindrome !
 */