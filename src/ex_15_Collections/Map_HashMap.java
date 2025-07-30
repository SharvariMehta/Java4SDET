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
    }
}
/*
OUTPUT:
HashMap : {101=Sharvari, 102=Samrika, 106=Faani}
 */