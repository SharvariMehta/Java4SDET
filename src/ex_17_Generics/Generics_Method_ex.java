package ex_17_Generics;

public class Generics_Method_ex {
    public static void main(String[] args) {
        sum(3,4);
        sum(3.4,4.4);
        sum(true,false);
        sum("Hello","Generics");
        sum('s','m');
    }
    static <T> T sum(T a, T b) {
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
        System.out.println();
        return null;
    }
}
/*
OUTPUT:
Value of a : 3
Value of b : 4

Value of a : 3.4
Value of b : 4.4

Value of a : true
Value of b : false

Value of a : Hello
Value of b : Generics

Value of a : s
Value of b : m
 */