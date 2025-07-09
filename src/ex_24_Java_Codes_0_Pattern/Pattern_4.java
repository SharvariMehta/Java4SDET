package ex_24_Java_Codes_0_Pattern;

public class Pattern_4 {
    public static void main(String[] args) {
        int i = 5;
        int j = 5;
        for(i =5; i>=1; i--)
        {
            do {
                System.out.print(" "+i+" ");
                j--;
            }while(j>=1);
            j = 5;
            System.out.println();
        }
    }
}
/*
OUTPUT:
 5  5  5  5  5
 4  4  4  4  4
 3  3  3  3  3
 2  2  2  2  2
 1  1  1  1  1
 */