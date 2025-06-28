package ex_01_Java_Basics;

import java.sql.SQLOutput;

public class InputUsingConsole {
    public static void main(String[] args) {
        String name = args[0];
        String age = args[1];
        String salary = args[2];
// Navigate to ^ symbol above --> Edit Configuration --> Give Input in Program Arguments Field
        System.out.println("Name : " +args[0]);
        System.out.println("Age : " +args[1]);
        System.out.println("Salary : " +args[2]);
    }
}
/*
Name : Sharvari
Age : 28
Salary : 10LPA
 */