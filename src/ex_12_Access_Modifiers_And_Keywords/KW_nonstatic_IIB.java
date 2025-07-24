package ex_12_Access_Modifiers_And_Keywords;

public class KW_nonstatic_IIB {
    public static <iib> void main(String[] args) {
        egiib a = new egiib();
    }
}
class egiib {
    {
        System.out.println("I am Instance Initialization Block : IIB");
    }
}
/*
OUTPUT:
I am Instance Initialization Block : IIB
 */