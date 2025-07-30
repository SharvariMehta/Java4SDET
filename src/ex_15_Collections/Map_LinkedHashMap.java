package ex_15_Collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_LinkedHashMap {
    public static void main(String[] args) {
        Map lhm1 = new LinkedHashMap();
        lhm1.put(106,"Faani");
        lhm1.put(102,"Samrika");
        lhm1.put(101,"Sharvari");
        System.out.println("LinkedHashMap_1 : "+lhm1);

        Map lhm2 = new LinkedHashMap();
        lhm2.put(107,"Sam");
        lhm2.put(104,"Dam");
        lhm2.put(108,"Jam");
        System.out.println("LinkedHashMap_2 : "+lhm2);

        ArrayList al = new ArrayList();
        al.add(lhm1);
        al.add(lhm2);
        System.out.println("Map converted to list : "+al);

    }
}
/*
OUTPUT:
LinkedHashMap_1 : {106=Faani, 102=Samrika, 101=Sharvari}
LinkedHashMap_2 : {107=Sam, 104=Dam, 108=Jam}
Map converted to list : [{106=Faani, 102=Samrika, 101=Sharvari}, {107=Sam, 104=Dam, 108=Jam}]
 */