package ex_03_Typecasting_and_Operators;

public class Arithmetic_Operators {
    public static void main(String[] args) {
        int a,b;            // Declaring variables.
        a = 20;             // Assigning values to a
        b = 12;             // Assigning values to b

        System.out.println("Addition Result : "+ (a+b) );
        System.out.println("Substraction Result : "+ (a-b) );
        System.out.println("Multiplication Result : "+ (a*b) );
        System.out.println("Division Result : "+ (a/b) );   // Returns Quotient of Division
        System.out.println("Modulus Result : "+ (a%b) );    // Returns Reminder of Division
    }
}
/*
OUTPUT:
Addition Result : 32
Substraction Result : 8
Multiplication Result : 240
Division Result : 1
Modulus Result : 8
 */