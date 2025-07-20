package ex_09_Polymorphism;

public class Method_OverRiding {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        f.occupation();
        s.occupation();
    }
    public static class Father {
        void occupation()
        {
            System.out.println("Father is Merchant");
        }
    }
    public static class Son extends Father{
        @Override
        void occupation()
        {
            System.out.println("Son is Engineer");
        }
    }
}
/*
OUTPUT:
Father is Merchant
Son is Engineer
 */