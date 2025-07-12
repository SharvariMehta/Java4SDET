package ex_19_Java_Codes_0_Pattern;

public class Pattern_5 {
    public static void main(String[] args) {
        int i = 5;
        int j = 5;
        do {
            for(i=5; i>=1; i--)
            {
                System.out.print(" "+i+" ");
            }
            j--;
            System.out.println();
        }while(j>=1);
    }
}
/*
OUTPUT:
 5  4  3  2  1
 5  4  3  2  1
 5  4  3  2  1
 5  4  3  2  1
 5  4  3  2  1
 */
