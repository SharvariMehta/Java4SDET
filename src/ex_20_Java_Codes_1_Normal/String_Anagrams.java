package ex_20_Java_Codes_1_Normal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Anagrams {
    public static void main(String[] args) {
        String s1 = "Qwerty";
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);

        String s2 = "ytrewQ";
        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);

        if(Arrays.equals(a1,a2))
        {
            System.out.println("Given Strings are Anagram");
        }
        else
        {
            System.out.println("Given Strings are not Anagram");
        }
    }
}
/*
OUTPUT:
Given Strings are Anagram
 */