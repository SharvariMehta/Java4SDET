package ex_15_Collections;

import java.util.Hashtable;

public class Map_HashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("abc",101);
        ht.put("def",102);
        ht.put("ijk",109);
        ht.put("lmn",108);
        // ht.put(null,108); NullPointerException
        // ht.put("lmn",null);  NullPointerException
        System.out.println("Hashtable : "+ht);
    }

}
/*
OUTPUT:
Hashtable : {ijk=109, lmn=108, abc=101, def=102}
 */