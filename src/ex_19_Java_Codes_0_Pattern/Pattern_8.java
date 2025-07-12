package ex_19_Java_Codes_0_Pattern;

public class Pattern_8 {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        for(i=1; i<=50; i++)
        {
            if(i%2 == 0)
            {
                System.out.printf("%3d",i);
                j++;
                if(j%5 == 0)
                    System.out.println();
            }
        }
    }
}
/*
OUTPUT:
  2  4  6  8 10
 12 14 16 18 20
 22 24 26 28 30
 32 34 36 38 40
 42 44 46 48 50
 */