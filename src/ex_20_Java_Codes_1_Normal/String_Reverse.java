package ex_20_Java_Codes_1_Normal;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        System.out.println("Enter a String you want to Reverse : ");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String reversed = ReverseFunction(original);
        System.out.println("Reversed String is : "+reversed);

    }

    public static String ReverseFunction(String original)
    {
        String reversed = "";
        for(int i = original.length()-1; i>=0; i--)
        {
            reversed = reversed + original.charAt(i);
        }
        return reversed;
    }
}
/*
OUTPUT:
Enter a String you want to Reverse :
qwerty
Reversed String is : ytrewq
 */