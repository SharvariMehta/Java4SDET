package b2_input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {

	public static void main(String[] args) {
        // Create BufferedReader object to read user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter your name:");
            // Read a line of input from the user
            String name = reader.readLine();

            System.out.println("Enter your age:");
            // Read another line of input
            String age = reader.readLine();

            // Display the input
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
	}
}
/*Output:
Enter your name:
sharvari
Enter your age:
28
Hello, sharvari! You are 28 years old.
 */