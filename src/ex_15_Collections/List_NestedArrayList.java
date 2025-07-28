package ex_15_Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List_NestedArrayList {
    public static void main(String[] args) {
        ArrayList fruits1 = new ArrayList();
        fruits1.add("apples");
        fruits1.add("mangoes");
        fruits1.add("cherry");

        ArrayList fruits2 = new ArrayList();
        fruits2.add("banana");
        fruits2.add("papaya");
        fruits2.add("jamun");

        System.out.println("Fruits1 ArrayList is : "+fruits1);
        System.out.println("Fruits2 ArrayList is : "+fruits2);

        ArrayList all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        System.out.println("Nested ArrayList is : "+all_fruits);
        System.out.println("First element of Nested Arraylist is : "+all_fruits.get(0));
        System.out.println("Second element of Nested Arraylist is : "+all_fruits.get(1));
    }
}
/*
OUTPUT:
Fruits1 ArrayList is : [apples, mangoes, cherry]
Fruits2 ArrayList is : [banana, papaya, jamun]
Nested ArrayList is : [[apples, mangoes, cherry], [banana, papaya, jamun]]
First element of Nested Arraylist is : [apples, mangoes, cherry]
Second element of Nested Arraylist is : [banana, papaya, jamun]
 */