package ex_03_Typecasting_and_Operators;

public class Implicit_TypeCasting {
    public static void main(String[] args) {

        byte x = 100;

        short s = x;
        System.out.println("Converted to Short Data Type : "+ s);

        int i = x;
        System.out.println("Converted to Int Data Type : "+ i);

        long l = x;
        System.out.println("Converted to Long Data Type : "+ l);

        double d = x;
        System.out.println("Converted to Double Data Type : "+ d);
    }
}
/*
OUTPUT:
Converted to Short Data Type : 100
Converted to Int Data Type : 100
Converted to Long Data Type : 100
Converted to Double Data Type : 100.0
*/