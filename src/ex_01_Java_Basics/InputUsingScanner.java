package ex_01_Java_Basics;

import java.util.Scanner; // Import the Scanner class

public class InputUsingScanner {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Taking a string input (e.g., name)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads an entire line of text

        // Taking an integer input (e.g., age)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer

        // Taking a double input (e.g., height)
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble(); // Reads a double

        // Displaying the input values
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}

/*
OUTPUT:
Enter your name: SHARVARI
Enter your age: 28
Enter your height in meters: 1.63

--- User Details ---
Name: SHARVARI
Age: 28
Height: 1.63 meters
 */


