package ex_04_Control_Flow;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age> 18)
            System.out.println("You can Vote !");
        else
            System.out.println("You cannot Vote !");
    }
}
/*
OUTPUT:
You cannot Vote !
 */