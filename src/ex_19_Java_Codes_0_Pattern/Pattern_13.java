package ex_19_Java_Codes_0_Pattern;

public class Pattern_13 {
    public static void main(String[] args) {

        for(int i=5; i>0; i--)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
/*
OUTPUT:
* * * * *
* * * *
* * *
* *
*
*/