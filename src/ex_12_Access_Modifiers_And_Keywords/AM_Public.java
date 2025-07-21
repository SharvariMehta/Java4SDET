package ex_12_Access_Modifiers_And_Keywords;

import ex_01_Java_Basics.publicAccessModifierDemo;

//Can be accessed from anywhere (any class, any package).
public class AM_Public {
    public int age = 50;
    void parentClass()
    {
        System.out.println("Variable is accessed in same Class : "+age);
    }
}
class publicClassChild extends AM_Public {
    void childClass()
    {
        AM_Public p2 = new AM_Public();
        System.out.println("Variable is accessed in Child class : "+p2.age);
    }
}
class samePackageAccess {
    void samePackage()
    {
        AM_Public p6 = new AM_Public();
        int age = p6.age;
        System.out.println("Variable is accessed in same Package : "+age);
    }
}
class AM_Public_Main_Class
{
    public static void main(String[] args) {
        AM_Public p1 = new AM_Public();
        p1.parentClass();   // Variable is accessed in Same Class
        samePackageAccess p7 = new samePackageAccess();
        p7.samePackage();
        publicClassChild p3 = new publicClassChild();
        p3.childClass();
        int age = p1.age;   // Variable is accessed in Main(Another) Class
        System.out.println("Variable is accessed in another Class : " +age);
        publicAccessModifierDemo p4 = new publicAccessModifierDemo();
        p4.anotherPackage();
    }
}
/*
OUTPUT:
Variable is accessed in same Class : 50
Variable is accessed in same Package : 50
Variable is accessed in Child class : 50
Variable is accessed in another Class : 50
Variable is accessed in another Package : 50

OUTPUT after changing variable once in same class its declared:
Variable is accessed in same Class : 80
Variable is accessed in same Package : 80
Variable is accessed in Child class : 80
Variable is accessed in another Class : 80
Variable is accessed in another Package : 80
 */