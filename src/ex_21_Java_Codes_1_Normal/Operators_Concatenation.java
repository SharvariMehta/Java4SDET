package ex_21_Java_Codes_1_Normal;

public class Operators_Concatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String FirstName = "Sharvari";
        String Lastname = "Mehta";
        System.out.println(a + b + FirstName + Lastname);   // Performs Addition Function
        System.out.println(FirstName + Lastname + a + b);   // Doesn't perform Addition Function
        System.out.println(FirstName + Lastname + (a + b)); // Performs Addition Function
    }
}
/*
OUTPUT:
30SharvariMehta
SharvariMehta1020
SharvariMehta30
 */