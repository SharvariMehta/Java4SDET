package ex_06_Strings;

public class String_Immutability {
    public static void main(String[] args) {
        // "sharvari" literal is created and interned; 'name' references it
        String name = "sharvari";

        // toUpperCase() returns a new String, but we ignore it here
        name.toUpperCase();
        // name is still pointing to the original "sharvari"
        System.out.println(name); // prints: sharvari

        // Now we assign the result of toUpperCase() to name:
        // a new String "SHARVARI" is created, and 'name' now references that
        name = name.toUpperCase();
        System.out.println(name); // prints: SHARVARI
/*
Key Takeaways on Immutability :
Strings cannot be changed after creation; methods like toUpperCase() always return a new String, never modify the original
When you do name.toUpperCase();, you're simply calling a method that produces a new string—but if you don’t assign it, the result is lost.
The line name = name.toUpperCase(); points name to the new uppercase String, but doesn't alter the old one—illustrating immutability         .
*/

    }
}

/*
OUTPUT:
sharvari
SHARVARI
 */