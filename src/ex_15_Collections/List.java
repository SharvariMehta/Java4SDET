package ex_15_Collections;

public class List {
    public static void main(String[] args) {
        java.util.List fruits = java.util.List.of("apple","mango","cherry","banana");
        System.out.println("List of Fruits : "+fruits);
        // fruits.add("chikoo"); Not possible as list is static interface, whose contents cannot be altered.
        // Hence, LinkedList and ArrayList are Introduced
    }
}
/*
OUTPUT:
List of Fruits : [apple, mango, cherry, banana]
 */