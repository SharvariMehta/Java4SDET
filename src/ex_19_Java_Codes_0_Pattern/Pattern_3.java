package ex_19_Java_Codes_0_Pattern;

public class Pattern_3 {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        do{
            for(i=1; i<=5; i++)
            {
                System.out.print(" "+i+" ");
            }
            System.out.println();
            j++;
        }while(j<=5);
    }
}
/*
OUTPUT:
 1  2  3  4  5
 1  2  3  4  5
 1  2  3  4  5
 1  2  3  4  5
 1  2  3  4  5
 */
