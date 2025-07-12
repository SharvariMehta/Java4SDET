package ex_06_Strings;

public class String_Concatenation {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.concat("World !");
        System.out.println("String Concatenated using concat() Function : "+s2);

        String s3 = s1+"Java !";
        System.out.println("String Concatenated using + Operator : "+s3);
    }
}
/*
OUTPUT:
String Concatenated using concat() Function : HelloWorld !
String Concatenated using + Operator : HelloJava !
StringBuilder, StringBuffer
 */
