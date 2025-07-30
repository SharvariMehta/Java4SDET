package ex_15_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> ll = new LinkedList();
        ll.add(6);
        ll.add(1);
        ll.add(8);
        System.out.println("Implementing LinkedList class of Queue Interface : "+ll);
    }
}
/*
OUTPUT:
Implementing LinkedList class of Queue Interface : [6, 1, 8]
*/