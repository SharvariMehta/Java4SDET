package ex_12_Access_Modifiers_And_Keywords;

public class KW_static_SIB {
    public static void main(String[] args) {
        sib s = new sib();
    }
}
class sib {
    static {
        System.out.println("I am a Static Initialization Block : SIB");
    }
}
/*
OUTPUT:
I am a Static Initialization Block : SIB
 */