

package ex_03_Typecasting_Operators;

public class Math_Class {
    public static void main(String[] args) {
        double x = 25.0;
        double y = 10.0;
        int a = 20;
        int b = 10;

        // Addition:
        System.out.println("Sum of a and b : " + Math.addExact(a, b));

        // Square root
        System.out.println("√" + x + " = " + Math.sqrt(x));

        // Power
        System.out.println(x + "^" + y + " = " + Math.pow(x, y));

        // Maximum
        System.out.println("Max of " + x + " and " + y + " = " + Math.max(x, y));

        // Minimum
        System.out.println("Min of " + x + " and " + y + " = " + Math.min(x, y));

        // Absolute value
        System.out.println("Absolute of -y = " + Math.abs(-y));

        // Random number between 0.0 and 1.0
        System.out.println("Random number = " + Math.random());
    }

}

/*
OUTPUT:
Sum of a and b : 30
√25.0 = 5.0
25.0^10.0 = 9.5367431640625E13
Max of 25.0 and 10.0 = 25.0
Min of 25.0 and 10.0 = 10.0
Absolute of -y = 10.0
Random number = 0.0721208142080475
 */

