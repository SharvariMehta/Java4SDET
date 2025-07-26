package ex_15_Collections;

public class wrapperClass {
    public static void main(String[] args) {
        int i1 = 10;
        Integer i2 = i1; //AutoBoxing : JVM will automatically update value from primitive to wrapper
        System.out.println("AutoBoxing : "+i2);

        Integer i3 = 23;
        int i4 = i3;        // Wrapper is removed, Attribute, Behaviour is lost
        System.out.println("Unboxing : "+i4);

        Integer i5 = 63;
        String s1 = i5.toString(); //Converting wrapper class to string
        System.out.println("Converting wrapper class 'Integer' to string : "+s1);

    }
}
class wrapperData{
    Integer i = 1234;
    Character c = 's';
    Long l = Long.valueOf(8308);
    Double d = 10.4;
    Float f = 5.7F;
    Boolean b = true;
}
/*
OUTPUT:
AutoBoxing : 10
Unboxing : 23
Converting wrapper class 'Integer' to string : 63
 */