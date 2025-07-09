package ex_24_Java_Codes_0_Pattern;

public class Pattern_1 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        do
        {
            for(i =1; i<=5; i++)
            {
                System.out.print(" * ");
            }
            System.out.println();
            j++;
        }while(j<=5);
    }
}
/*
OUTPUT:
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 */