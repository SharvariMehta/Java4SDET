package ex_14_Keywords;

public class KW_static1 {
    public static void main(String[] args) {
        System.out.println("Scenario 1 :");
        eg_static_kw ref1 = new eg_static_kw(10);
        ref1.displayValue();
        System.out.println("Scenario 2 :");
        eg_static_kw ref2 = new eg_static_kw(30);
        ref2.displayValue();
        System.out.println("Static variable called without creating reference variable : "+eg_static_kw.b);
    }
}
class eg_static_kw {
    int a = 10;
    static int b = 20;
    eg_static_kw(int a) {
        this.a = a;
    }
    void displayValue() {
        System.out.println("Value of non-static variable a : "+a);
        System.out.println("Value of static variable b : "+b);
    }
}
/*
OUTPUT:
Scenario 1 :
Value of non-static variable a : 10
Value of static variable b : 20
Scenario 2 :
Value of non-static variable a : 30
Value of static variable b : 20
 */