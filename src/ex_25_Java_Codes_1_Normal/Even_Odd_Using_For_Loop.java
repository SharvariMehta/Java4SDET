package ex_25_Java_Codes_1_Normal;

public class Even_Odd_Using_For_Loop {
    public static void main(String[] args) {
        System.out.println("Even Numbers using For Loop : ");
        for(int i=1; i<=50; i++)
        {
            if(i%2 == 0)
                System.out.print(" "+i);
        }
        System.out.println("\nOdd Numbers using For Loop : ");
        for(int j = 0; j<= 50; j++)
        {
            if(j%2 != 0)
                System.out.print(" "+j);
        }
    }
}
/*
OUTPUT:
Even Numbers using For Loop :
 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
Odd Numbers using For Loop :
 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49
 */