package ex_03_Typecasting_and_Operators;

public class Ternary_Operator {
    public static void main(String[] args) {
        int age = 27;

        // Using ternary operator to check if number is even or odd
        String CanVote = (age > 18) ? "Yes" : "No";
        // Format : (condition) ? value_if_true : value_if_false;

        // number % 2 == 0 → checks if the number is divisible by 2 (i.e., even).
        // If true, assigns "Even" to result.
        // If false, assigns "Odd" to result.

        // Print the result
        System.out.println("Can you vote ? " + CanVote);
    }
}
/*
OUTPUT:
Can you vote ? Yes
 */