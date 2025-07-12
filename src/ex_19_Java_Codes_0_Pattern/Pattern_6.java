package ex_19_Java_Codes_0_Pattern;

public class Pattern_6 {
    public static void main(String[] args) {
        int j = 5;

        for(int i=1; i<= 25; i++ )
        {
            System.out.printf("%2d ", i);
            /*
%2d indicates:
%: This signifies the start of a format specifier.
2: This is the width specifier, meaning the output should occupy a minimum of 2 characters.
If the integer value requires fewer than 2 characters, it will be padded with leading spaces to reach the specified width.
             */
            if(i%5 == 0)
                System.out.println();
        }
    }
}
/*
OUTPUT:
 1  2  3  4  5
 6  7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
 */