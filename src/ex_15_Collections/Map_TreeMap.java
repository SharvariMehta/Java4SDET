package ex_15_Collections;

import java.util.Map;
import java.util.TreeMap;

public class Map_TreeMap {
    public static void main(String[] args) {
        Map tm = new TreeMap();
        tm.put("abc",101);
        tm.put("def",102);
        tm.put("ijk",109);
        tm.put("lmn",108);
        System.out.println("TreeMap : "+tm);
    }
}
/*
OUTPUT:
TreeMap : {abc=101, def=102, ijk=109, lmn=108}
 */