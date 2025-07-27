package ex_14_Keywords;

public class KW_static2 {
    public static void main(String[] args) {
        //Static methods and variables can be accessed without creating an object of class
        svarmethod.StaticClass();
        int a = svarmethod.StaticVar;
        System.out.println("Static Variable : "+a);

        //Non-Static methods and variables cannot be accessed without creating an object of class
        svarmethod sv = new svarmethod();
        sv.NonStaticClass();
        int b = sv.NonStaticVar;
        System.out.println("Non-Static Variable : "+b);
    }
}
class svarmethod {
    static {
        System.out.println("I am a Static Initialization Block : SIB");
    }
    {
        System.out.println("I am an Instance Initialization Block : IIB");
    }
    int NonStaticVar = 10;
    static int StaticVar = 20;

    void NonStaticClass()
    {
        System.out.println("I am a non-static class !");
    }
    static void StaticClass()
    {
        // System.out.println(NonStaticVar);
        // non-static variable NonStaticVar cannot be called/used in static class
        System.out.println("I am a static class !");
    }
}
/*
OUTPUT:
I am a Static Initialization Block : SIB
I am a static class !
Static Variable : 20
I am an Instance Initialization Block : IIB
I am a non-static class !
Non-Static Variable : 10
 */