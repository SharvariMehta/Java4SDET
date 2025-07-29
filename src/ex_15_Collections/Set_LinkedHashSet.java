package ex_15_Collections;

import java.util.LinkedHashSet;

public class Set_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Apple");
        lhs.add("Mango");
        lhs.add("Cherry");
        lhs.add(123);
        lhs.add(null);
        lhs.add(456);
        System.out.println("LinkedHashSet (order maintained) : "+lhs);
    }
}
/*
OUTPUT:
LinkedHashSet (order maintained) : [Apple, Mango, Cherry, 123, null, 456]
 */