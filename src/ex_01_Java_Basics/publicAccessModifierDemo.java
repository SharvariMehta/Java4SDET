package ex_01_Java_Basics;

import ex_12_Access_Modifiers.AM_Public;

public class publicAccessModifierDemo
{
    public void anotherPackage() {
        AM_Public p5 = new AM_Public();
        int age = p5.age;
        System.out.println("Variable is accessed in another Package : "+age);
    }
}
