package ex_20_Java_Codes_1_Normal;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int first = 0; int second = 1;
        int n = 10;
        for(int i = 0; i<=n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
/*
OUTPUT:
0 1 1 2 3 5 8 13 21 34 55
 */