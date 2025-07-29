package ex_15_Collections;

import java.sql.SQLOutput;
import java.util.Stack;

public class List_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Sharvari");
        s.push("Ruhani");
        s.push("Steffi");
        s.push("Prachi");
        System.out.println("Stack List is : "+s);
        System.out.println("Last element can be seen using peek function : "+s.peek());
        s.pop();
        System.out.println("After popping, due to LIFO principle last element is removed.");
        System.out.println("Updated stack list is : "+s);
    }
}
/*
OUTPUT:
Stack List is : [Sharvari, Ruhani, Steffi, Prachi]
Last element can be seen using peek function : Prachi
After popping, due to LIFO principle last element is removed.
Updated stack list is : [Sharvari, Ruhani, Steffi]
 */