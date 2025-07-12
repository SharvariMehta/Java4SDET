package ex_19_Java_Codes_0_Pattern;

public class Pattern_2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        for(i = 1; i<=5; i++)
        {
            do {
                System.out.print(" "+i+" ");
                j++;
            }while(j<=5);
            j = 1;
            System.out.println();
        }
    }
}
/*
OUTPUT:
 1  1  1  1  1
 2  2  2  2  2
 3  3  3  3  3
 4  4  4  4  4
 5  5  5  5  5
 */