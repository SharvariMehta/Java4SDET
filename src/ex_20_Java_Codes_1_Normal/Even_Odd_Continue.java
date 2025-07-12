package ex_20_Java_Codes_1_Normal;

public class Even_Odd_Continue {
    public static void main(String[] args) {

        for(int i = 0; i<=10;i++)
        {
            if(i%2 == 0){
                System.out.print(" Even: "+i);
                continue;
            }
            System.out.print(" Odd: "+i);
        }
    }
}
/*
OUTPUT:
Even: 0 Odd: 1 Even: 2 Odd: 3 Even: 4 Odd: 5 Even: 6 Odd: 7 Even: 8 Odd: 9 Even: 10
 */