package ex_11_Object_Oriented_Programs;

public class Built_In_Function {
    public static void main(String[] args) {
        int max = Math.max(3,4);
        int min = Math.min(3,4);
/*
In Java, the java.lang.Math class provides a collection of built-in functions for performing common mathematical operations.
These functions are static methods, meaning they can be called directly on the Math class without needing to create an object of the class.
Example:
max(value1, value2): Returns the greater of two given values.
min(value1, value2): Returns the smaller of two given values.
 */
        System.out.println("Maximum Number : "+max);
        System.out.println("Minimum Number : "+min);
    }
}
/*
OUTPUT:
Maximum Number : 4
Minimum Number : 3
 */