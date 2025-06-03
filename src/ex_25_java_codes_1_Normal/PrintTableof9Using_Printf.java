package ex_25_java_codes_1_Normal;

public class PrintTableof9Using_Printf {
    public static void main(String[] args) {
        // Declare a variable to store the number for which we want the table
        int number = 9;

        // Loop from 1 to 10 to print the table
        for (int i = 1; i <= 10; i++) {
            // Print the formatted output using %d for integers
            // %d is a placeholder for integer values
            // \n is used to move to the next line after each output
            System.out.printf("%d x %d = %d\n", number, i, number * i);
            // Explanation:
            // First %d -> value of 'number' (which is 9)
            // Second %d -> value of 'i' (loop counter from 1 to 10)
            // Third %d -> result of multiplication (number * i)
        }
    }
}
/*
OUTPUT:
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
9 x 4 = 36
9 x 5 = 45
9 x 6 = 54
9 x 7 = 63
9 x 8 = 72
9 x 9 = 81
9 x 10 = 90
 */