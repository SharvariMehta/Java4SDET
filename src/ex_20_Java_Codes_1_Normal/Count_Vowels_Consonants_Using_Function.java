package ex_20_Java_Codes_1_Normal;

import java.util.Scanner;

public class Count_Vowels_Consonants_Using_Function {
    public static void main(String[] args) {
        System.out.println("Enter a String to count Vowels : ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        userInput = userInput.toLowerCase();
        System.out.println("Number of vowels in String are : "+vowelcount(userInput));
        System.out.println("Number of Consonants in String are : "+consonantcount(userInput));
    }

    public static int vowelcount(String userInput)
    {
        int v = 0;
        for(int i = 0; i<=userInput.length()-1; i++)
        {
            if(userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u')
            {
                v++;
            }
        }
        return v;
    }

    public static int consonantcount(String userInput)
    {
        int c = 0;
        for(int i = 0; i<=userInput.length()-1; i++)
        {
            if(userInput.charAt(i) != 'a' && userInput.charAt(i) != 'e' && userInput.charAt(i) != 'i' && userInput.charAt(i) != 'o' && userInput.charAt(i) != 'u')
            {
                c++;
            }
        }
        return c;
    }
}
/*
OUTPUT:
SharvariMehta
Number of vowels in String are : 5
Number of Consonants in String are : 8
*/