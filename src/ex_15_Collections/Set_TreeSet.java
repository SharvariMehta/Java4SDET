package ex_15_Collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class Set_TreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("Mango");
        ts.add("Apple");
        ts.add("Watermelon");
        ts.add("Orange");
        ts.add("Watermelon");   // Doesn't Take Duplicates
        // ts.add(null); NullPointerException
        // ts.add(123); Gives ClassCastException
        System.out.println("TreeSet (sorted as per ASCII values alphabetically) : "+ts);
    }
}
/*
OUTPUT:
TreeSet (sorted as per ASCII values alphabetically) : [Apple, Mango, Orange, Watermelon]
 */