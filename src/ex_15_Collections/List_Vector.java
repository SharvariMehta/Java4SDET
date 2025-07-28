package ex_15_Collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class List_Vector {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add("Ram");
        v.add("Shyam");
        v.add("Lakshman");
        v.add("Sita");
        System.out.println("Elements in Vector v are : "+v);
        System.out.println("Size of vector v is : "+v.size());
        System.out.println("Displaying Elements of Vector v using For each Loop :");
        for(Object o : v ) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("Displaying Elements of Vector v using Iterator :");
        Iterator i = v.iterator();
        while(i.hasNext()) {
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println("Displaying Elements of Vector v using ListIterator :");
        ListIterator l = v.listIterator();
        while(l.hasNext()) {
            System.out.print(l.next()+" ");
        }
        System.out.println();
        System.out.println("Reversing Elements of Vector v using ListIterator :");
        ListIterator m = v.listIterator();
        while(l.hasPrevious()) {
            System.out.print(l.previous()+" ");
        }
    }
}
/*
OUTPUT:
Elements in Vector v are : [Ram, Shyam, Lakshman, Sita]
Size of vector v is : 4
Displaying Elements of Vector v using For each Loop :
Ram Shyam Lakshman Sita
Displaying Elements of Vector v using Iterator :
Ram Shyam Lakshman Sita
Displaying Elements of Vector v using ListIterator :
Ram Shyam Lakshman Sita
Reversing Elements of Vector v using ListIterator :
Sita Lakshman Shyam Ram
 */