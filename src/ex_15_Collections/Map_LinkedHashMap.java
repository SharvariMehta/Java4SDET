package ex_15_Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_LinkedHashMap {
    public static void main(String[] args) {
        Map lhm = new LinkedHashMap();
        lhm.put(106,"Faani");
        lhm.put(102,"Samrika");
        lhm.put(101,"Sharvari");
        System.out.println("LinkedHashMap : "+lhm);
    }
}
/*
OUTPUT:
LinkedHashMap : {106=Faani, 102=Samrika, 101=Sharvari}
 */