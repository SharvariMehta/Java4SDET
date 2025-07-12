package ex_06_Strings;

public class String_Declaration {
    public static void main(String[] args) {
        // 1. Declaration using String Literal
        String name1 = "Sharvari";   // SCP(String Constant Pool) || Static Memory
        System.out.println("String Stored in SCP(String Constant Pool) || Static Memory: "+name1);

        // 2. Declaration using new Keyword
        String name2 = new String("Sharvari");   //Heap Memory
        System.out.println("String Stored in Heap Memory: "+name1);
    }
}
/*
OUTPUT:
String Stored in SCP(String Constant Pool) || Static Memory: Sharvari
String Stored in Heap Memory: Sharvari
 */