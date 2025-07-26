package ex_15_Collections;

public class wrapperClass {
    public static void main(String[] args) {
        int i1 = 10;
        Integer i2 = i1; //AutoBoxing : JVM will automatically update value from primitive to wrapper
        System.out.println("AutoBoxing (Converting int to Integer) : "+i2);

        Integer i3 = 23;
        int i4 = i3;        // Wrapper is removed, Attribute, Behaviour is lost
        System.out.println("Unboxing (Converting Integer to int) : "+i4);

        Integer i5 = 63;
        String s1 = i5.toString(); //Converting wrapper class 'Integer' to string
        System.out.println("Converting wrapper class 'Integer' to string using toString(int) : "+s1);

        String s2 = "282879";
        Integer i6 = Integer.parseInt(s2);  //Converting string to wrapper class 'Integer' using parseInt(stringName)
        System.out.println("Converting string to wrapper class 'Integer' using parseint(stringName) : "+i6);

        int i7 = Integer.parseInt(s2);
        System.out.println("Converting string to primitive data type int using Integer.parseInt(stringName) :"+i7);

        Integer i8 = Integer.valueOf(s2);  //Converting string to wrapper class 'Integer' using valueOf(stringName)
        System.out.println("Converting string to wrapper class 'Integer' using valueOf(stringName) : "+i8);

        int i9 = Integer.parseInt(s2);
        System.out.println("Converting string to primitive data type int using valueOf.parseInt(stringName) :"+i9);
    }
}
/*
OUTPUT:
AutoBoxing (Converting int to Integer) : 10
Unboxing (Converting Integer to int) : 23
Converting wrapper class 'Integer' to string using toString(int) : 63
Converting string to wrapper class 'Integer' using parseint(stringName) : 282879
Converting string to primitive data type int using Integer.parseInt(stringName) :282879
Converting string to wrapper class 'Integer' using valueOf(stringName) : 282879
Converting string to primitive data type int using valueOf.parseInt(stringName) :282879
 */