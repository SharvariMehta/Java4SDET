package ex_01_Java_Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUsingBufferReader {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader object to read from the keyboard (System.in)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");  // Ask user to enter name
        String name = br.readLine();            // Read a full line of text (as String)
        System.out.println("Name: " + name);    // Print the inputs
    }
}
/*
OUTPUT:
Enter your name: Sharvari Pravin Mehta
Name: Sharvari Pravin Mehta
 */