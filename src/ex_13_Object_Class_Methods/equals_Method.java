package ex_13_Object_Class_Methods;

public class equals_Method {
    public static void main(String[] args) {
        //Used to check if two strings are equal
        String s1 = "Sharvari";
        String s2 = "Sharvari";
        String s3 = new String("Sharveari");
        System.out.println("String s1 equal to String s2 : "+(s1.equals(s2)));
        System.out.println("String s1 equal to String s3 : "+(s1.equals(s3)));
    }
}
/*
OUTPUT:
String s1 equal to String s2 : true
String s1 equal to String s3 : false
 */