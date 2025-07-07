package ex_25_Java_Codes_1_Normal;

import java.util.Scanner;

public class FizzBuzz_Test {
    public static void main(String[] args) {
        for(int i =1; i<=20; i++)
        {
            if((i%3) == 0 && (i%5) == 0)
                System.out.println("FizzBuzz");
            else if (i%3 == 0)
                System.out.println("Fizz");
            else if (i%5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
/*
OUTPUT:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
 */