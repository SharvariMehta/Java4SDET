package ex_19_Java_Codes_0_Pattern;

public class Pattern_14 {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
OUTPUT:
     *
    **
   ***
  ****
 *****
 */