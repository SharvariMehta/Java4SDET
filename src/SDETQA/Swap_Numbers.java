package SDETQA;

public class Swap_Numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping : a = " +a + " " + "b = "  + b);
        //Logic 1: Using a temporary variable
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (using temp variable): a = " + a + ", b = " + b);
        //Logic 2: Without using a temporary variable
        a = a+b;
        a = a-b;
        b = a-b;
        System.out.println("After swapping (without using temp variable): a = " + a + ", b = " + b);
    }
}
/*
Before swapping : a = 10 b = 20
After swapping (using temp variable): a = 20, b = 10
After swapping (without using temp variable): a = 20, b = 10
 */