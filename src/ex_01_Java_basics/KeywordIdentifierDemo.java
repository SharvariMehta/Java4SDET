package ex_01_Java_basics;
// This program demonstrates the difference between keywords and identifiers in Java

/*
 * Definition:
 * Keywords: Reserved words in Java that have a predefined meaning in the language.
 *           They are used to define the syntax and structure of Java programs.
 *           Examples: class, public, static, void, int, if, else, etc.
 *
 * Identifiers: Names used by the programmer to identify classes, methods, variables, etc.
 *              They are user-defined and must follow Java naming rules.
 *              Examples: main, message, number, MyClass, calculateTotal, etc.
 */

// 'public' is a keyword: it defines the access level (visible to all)
// 'class' is a keyword: it is used to declare a class
// 'KeywordIdentifierDemo' is an identifier: name of the class (user-defined)
public class KeywordIdentifierDemo {

    // 'public', 'static', and 'void' are keywords:
    // - 'public': access modifier
    // - 'static': allows the method to be called without creating an object
    // - 'void': means this method does not return any value
    // 'main' is an identifier: it's the name of the method
    // 'String' is a class name (treated as an identifier)
    // 'args' is an identifier: it's the name of the parameter
    public static void main(String[] args) {

        // 'int' is a keyword: used to declare an integer type variable
        // 'number' is an identifier: name of the variable created by the programmer
        int number = 10;

        // 'String' is an identifier referring to a class from Java's standard library
        // 'message' is an identifier: name of the variable storing text
        String message = "Hello, Java!";

        // 'System', 'out', and 'println' are identifiers from the Java API
        // They are not keywords, but predefined classes and objects
        System.out.println(message + " Number is: " + number);
    }
}


