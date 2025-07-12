package ex_06_Strings;

public class String_Initialization {
    public static void main(String[] args) {
        // 1. String literal — stored in the string pool
        String literal = "hello";

        // 2. Using `new` keyword — creates a new object on the heap
        String newString = new String("world");

        // 3. From character array — constructs a String from characters
        char[] chars = {'J', 'a', 'v', 'a'};
        String fromChars = new String(chars);

        // 4. From a subset of a char array — specify offset and length
        char[] moreChars = {'P', 'r', 'o', 'g', 'r', 'a', 'm'};
        String subChars = new String(moreChars, 3, 4); // "gram"

        // 5. Empty strings — literal and with new keyword
        String emptyLiteral = "";
        String emptyNew = new String();

        // 6. Null initialization — no object referenced
        String nullString = null;

        // Print values and reference comparisons
        System.out.println("literal = " + literal);
        System.out.println("newString = " + newString);
        System.out.println("fromChars = " + fromChars);
        System.out.println("subChars = " + subChars);
        System.out.println("emptyLiteral==emptyNew? " + (emptyLiteral == emptyNew));
        System.out.println("nullString = " + nullString);
    }
}
/*
OUTPUT:
literal = hello
newString = world
fromChars = Java
subChars = gram
emptyLiteral==emptyNew? false
nullString = null
 */