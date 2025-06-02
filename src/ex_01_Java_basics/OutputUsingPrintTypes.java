package ex_01_Java_basics;

public class OutputUsingPrintTypes {
       public static void main(String[] args) {

            // Using print(): prints text on the same line, no newline at the end
            System.out.print("This is ");
            System.out.print("printed using print()");

            System.out.println(); // Just to add a line break for clarity

            // Using println(): prints text and moves to the next line
            System.out.println("This is printed using println()");
            System.out.println("Each println starts on a new line.");

            System.out.println(); // Line break

            // Using printf(): prints formatted text
            String name = "Alice";
            int score = 95;
            double percentage = 95.5;

            // %s for string, %d for int, %.2f for float with 2 decimal places, %n for newline
            System.out.printf("Name: %s%n", name);
            System.out.printf("Score: %d%n", score);
            System.out.printf("Percentage: %.2f%%%n", percentage);

            // Note: printf does NOT automatically add a new line unless %n or \n is included
       }
    }

/*
OUTPUT:
This is printed using print()
This is printed using println()
Each println starts on a new line.

Name: Alice
Score: 95
Percentage: 95.50%
 */
