package ex_24_Java_Codes_0_Pattern;

public class Pattern_9 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int k = 0;
        for(j=1; j<=5; j++)
        {
            for(i=1; i<=5; i++)
            {
                k = j * i;
                System.out.printf("%3d",k);
            }
            System.out.println();
        }
    }
}
/*
OUTPUT:;
  1  2  3  4  5
  2  4  6  8 10
  3  6  9 12 15
  4  8 12 16 20
  5 10 15 20 25
 */