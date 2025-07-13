package ex_06_Strings;

public class String_Concatenation {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.concat("World !");
        System.out.println("String Concatenated using concat() Function : "+s2);

        String s3 = s1+"Java !";
        System.out.println("String Concatenated using + Operator : "+s3);

        StringBuilder sbd = new StringBuilder("Sharvari");
        sbd.append("Mehta");
        System.out.println("String Concatenated using String Builder : "+sbd);

        StringBuffer sbf = new StringBuffer("Sharvari");
        sbf.append("Mehta");
        System.out.println("String Concatenated using String Buffer : "+sbf);
    }
}
/*
OUTPUT:
String Concatenated using concat() Function : HelloWorld !
String Concatenated using + Operator : HelloJava !
String Concatenated using String Builder : SharvariMehta
String Concatenated using String Buffer : SharvariMehta
 */
