package ex_06_Strings;

import java.util.Arrays;

public class String_Conversion {
    public static void main(String[] args) {
        //Conversion String to Integer
        String s1 = "67890";
        int n1 = Integer.parseInt(s1);
        System.out.println("Conversion from String to Integer : "+n1);

        //Conversion Integer to String
        int n2 = 12345;
        String s2 = Integer.toString(n2);
        System.out.println("Conversion from Integer To String : "+s2);

        //Conversion from char to String
        char c1 = 'a';
        String s3 = String.valueOf(c1);
        System.out.println("Conversion from Character To String : "+s3);

        //Conversion from String to char
        String s4 = "Sharvari";
        char[] c2 = s4.toCharArray();
        System.out.print("Conversion from String to Character Array : ");
        for(int i = 0;i<=c2.length-1;i++)
        {
            System.out.print(c2[i]);
        }
    }
}
/*
OUTPUT:
Conversion from String to Integer : 67890
Conversion from Integer To String : 12345
Conversion from Character To String : a
Conversion from String to Character Array : Sharvari
 */