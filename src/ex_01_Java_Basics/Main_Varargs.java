package ex_01_Java_Basics;

public class Main_Varargs {
    public static void main(String...args) {
        System.out.println("Declaring String... args allows you to pass a variable number of arguments—but internally it’s treated as a String[] array \n" +
                "The compiler and JVM see no difference at runtime between String[] args and String... args ");
    }
}
/*
OUTPUT:
Declaring String... args allows you to pass a variable number of arguments—but internally it’s treated as a String[] array
The compiler and JVM see no difference at runtime between String[] args and String... args
*/
