package ex_24_Java_Codes_0_Pattern;

public class Pattern_7 {
    public static void main(String[] args) {
        int i =1;
        int j = 0;
        for(i=1; i<=50; i++)
        {
            if(i%2 != 0)
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
  1  3  5  7  9
 11 13 15 17 19
 21 23 25 27 29
 31 33 35 37 39
 41 43 45 47 49
 */