package ex_14_Keywords;

public class KW_nonstatic_IIB {
    public static <iib> void main(String[] args) {
        eg_iib a = new eg_iib();
    }
}
class eg_iib {
    {
        System.out.println("I am Instance Initialization Block : IIB");
    }
}
/*
OUTPUT:
I am Instance Initialization Block : IIB
 */