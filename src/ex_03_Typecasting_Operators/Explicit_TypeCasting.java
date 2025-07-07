package ex_03_Typecasting_Operators;

public class Explicit_TypeCasting {
    public static void main(String[] args) {
        double d = 100.345;

        float f = (float)d;
        System.out.println("Converted to Float Data Type : "+f);
        long l = (long)d;
        System.out.println("Converted to Long Data Type : "+l);
        int i = (int)d;
        System.out.println("Converted to Integer Data Type : "+i);
        short s = (short)d;
        System.out.println("Converted to Short Data Type : "+s);
        byte b = (byte)d;
        System.out.println("Converted to Byte Data Type : "+b);
    }
}
/*
OUTPUT:
Converted to Float Data Type : 100.345
Converted to Long Data Type : 100
Converted to Integer Data Type : 100
Converted to Short Data Type : 100
Converted to Byte Data Type : 100
 */