package ex_01_Java_basics;

// This is a simple Java program that prints "Hello, World!" to the console.

public class HelloWorld {
    // 'public' means accessible from anywhere. 'class' defines a class named HelloWorld.

    public static void main(String[] args) {
        // 'public' - JVM can access this method.
        // 'static' - Can run without creating an object of the class.
        // 'void' - This method doesn't return anything.
        // 'main' - Entry point of the program.
        // 'String[] args' - Accepts command-line arguments as a string array.

        System.out.println("Hello Java!");
        // 'System' - A built-in class that provides access to system-level features.
        // 'out' - A static member of System, represents standard output (console).
        // 'println' - Prints the string and moves to the next line.
        // "Hello, World!" - The string to be printed.
    }
} // End of class

/*
OUTPUT:
Hello Java!
 */
