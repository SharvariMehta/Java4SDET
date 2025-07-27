package ex_13_Object_Class_Methods;

public class toString_Method {
    public static void main(String[] args) {
        int n = 200;
        String s = Integer.toString(n);
        System.out.println("Converting wrapper class 'Integer' to string using toString(int) : "+s+10);
    }
}
/*
OUTPUT:
Converting wrapper class 'Integer' to string using toString(int) : 20010
 */