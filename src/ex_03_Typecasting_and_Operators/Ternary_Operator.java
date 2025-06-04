package ex_03_Typecasting_and_Operators;

public class Ternary_Operator {
    public static void main(String[] args) {
        int number = 7;

        // Using ternary operator to check if number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";
        // Format : (condition) ? value_if_true : value_if_false;

        // number % 2 == 0 → checks if the number is divisible by 2 (i.e., even).
        // If true, assigns "Even" to result.
        // If false, assigns "Odd" to result.

        // Print the result
        System.out.println("The number " + number + " is " + result);
    }
}
/*
OUTPUT:
The number 7 is Odd
 */