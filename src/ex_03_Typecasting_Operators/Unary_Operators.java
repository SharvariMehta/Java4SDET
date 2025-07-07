package ex_03_Typecasting_Operators;

public class Unary_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = +10;    // value is 10
        int d = -10;    // value is -10

        a++;    // Increase value of a by 1
        b--;    // Decrease value of b by 1

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
/*
OUTPUT:
11
9
10
-10
 */