package ex_15_Collections;

import java.util.LinkedList;

public class List_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("Linked List animals contains : "+animals);
        System.out.println("First Element of Linked List animal : "+animals.getFirst());
        System.out.println("Last Element of Linked List animal : "+animals.getLast());
        System.out.println("Size of Linked List animals before removing Cat and Dog is : "+animals.size());
        animals.remove("Dog");
        animals.remove("Cat");
        System.out.println("Size of Linked List animals after removing Cat and Dog is : "+animals.size());
    }
}
/*
OUTPUT:
Linked List animals contains : [Lion, Dog, Cat, Elephant]
First Element of Linked List animal : Lion
Last Element of Linked List animal : Elephant
Size of Linked List animals before removing Cat and Dog is : 4
Size of Linked List animals after removing Cat and Dog is : 2
 */