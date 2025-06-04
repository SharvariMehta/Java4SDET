package ex_02_Datatypes_Variables;

public class Primitive_data_types {
    public static void main(String[] args) {
        // Primitive Data Types

        // Integer types
        byte byteVal = 127;              // 1 byte, range: -128 to 127
        short shortVal = 32000;          // 2 bytes, range: -32,768 to 32,767
        int intVal = 100000;             // 4 bytes, range: -2^31 to 2^31-1
        long longVal = 10000000000L;     // 8 bytes, range: -2^63 to 2^63-1

        // Floating point types
        float floatVal = 3.14f;          // 4 bytes, up to 7 decimal digits
        double doubleVal = 3.1415926535; // 8 bytes, up to 15 decimal digits

        // Character type
        char charVal = 'A';              // 2 bytes, stores a single character or ASCII value

        // Boolean type
        boolean boolVal = true;          // 1 bit, stores true or false

        // Printing primitive data types
        System.out.println("---- Primitive Data Types ----");
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + boolVal);
    }
}

/*
OUTPUT:
---- Primitive Data Types ----
byte: 127
short: 32000
int: 100000
long: 10000000000
float: 3.14
double: 3.1415926535
char: A
boolean: true
 */