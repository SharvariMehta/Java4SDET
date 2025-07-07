package ex_25_Java_Codes_1_Normal;

import java.util.Scanner;

public class Count_Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Calculate its Vowels and Consonants : ");
        String s = sc.nextLine();
        String s1 = s.toLowerCase();
        int v = 0;
        int c = 0;
        for(int i = 0; i<s1.length(); i++)
        {
            char a = s1.charAt(i);
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
            {
                v++;
            }
            else
            {
                c++;
            }

            if(a == ' ')
            {
                c--;
            }
        }
        System.out.println("String Entered by User : "+s);
        System.out.println("Number of Vowels in String : "+v);
        System.out.println("Number of Consonants in String : "+c);
    }
}
/*
OUTPUT:
Enter a String to Calculate its Vowels and Consonants :
Sharvari Pravin Mehta
String Entered by User : Sharvari Pravin Mehta
Number of Vowels in String : 7
Number of Consonants in String : 12
 */