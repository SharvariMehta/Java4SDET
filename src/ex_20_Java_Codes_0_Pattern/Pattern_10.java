package ex_20_Java_Codes_0_Pattern;

public class Pattern_10 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        do
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
            i++;
        }while(i<=5);
    }
}
/*
OUTPUT:
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 */