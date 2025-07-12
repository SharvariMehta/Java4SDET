package ex_06_Strings;

public class String_Immutability {
    public static void main(String[] args) {
        String name = "sharvari";
        name.toUpperCase();
        System.out.println(name);
        name = name.toUpperCase();
        System.out.println(name);
    }
}
