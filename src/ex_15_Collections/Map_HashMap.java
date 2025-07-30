package ex_15_Collections;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
    public static void main(String[] args) {
        Map hm = new HashMap();
        hm.put(106,"Faani");
        hm.put(102,"Samrika");
        hm.put(101,"Sharvari");
        System.out.println("HashMap : "+hm);
        System.out.println("Key Set : "+hm.keySet());
        System.out.println("Collection of values : "+hm.values());
        System.out.println("Entry Set : "+hm.entrySet());
        System.out.println("Is object 1 equal to object 2 ? "+(hm.get(101).equals(hm.get(102))));
    }
}
/*
OUTPUT:
HashMap : {101=Sharvari, 102=Samrika, 106=Faani}
Key Set : [101, 102, 106]
Collection of values : [Sharvari, Samrika, Faani]
Entry Set : [101=Sharvari, 102=Samrika, 106=Faani]
Is object 1 equal to object 2 ? false
 */