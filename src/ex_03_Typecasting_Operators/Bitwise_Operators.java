package ex_03_Typecasting_Operators;

public class Bitwise_Operators {
    public static void main(String[] args) {
        System.out.println("------Bitwise NOT Operator(~)-----");
        int x = 5;  // Binary: 0000 0101
        // (~ Turns every 1 into 0, and every 0 into 1.)
        // ~x  = 1111 1010 which is -6 in 2’s complement
        int result = ~x;  // Bitwise NOT
        System.out.println("Original x = " + x);        // 5
        System.out.println("Binary of x = " + Integer.toBinaryString(x));  // 101
        System.out.println("~x = " + result);            // -6
        System.out.println("Binary of ~x = " + Integer.toBinaryString(result));
        //
    }
}
