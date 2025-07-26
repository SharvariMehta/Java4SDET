package ex_15_Collections;

public class wrapperClass {
    public static void main(String[] args) {
        Integer i1 = 63;
        String s1 = i1.toString(); //Converting wrapper class to string
        System.out.println(s1);

        int i2 = 32;

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