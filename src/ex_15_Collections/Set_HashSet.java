package ex_15_Collections;

import java.util.HashSet;

public class Set_HashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Cherry");
        hs.add(123);
        hs.add(null);
        hs.add(456);
        System.out.println("HashSet (no order maintained) : "+hs);
    }
}
/*
OUTPUT:
HashSet (no order maintained) : [null, Apple, Cherry, Mango, 456, 123]
 */