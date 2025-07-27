package ex_12_Access_Modifiers;

//Protected variables are accessible in same class, subclasses and in same package
// and NOT accessible in another class and another Package
public class AM_Protected {
    public static void main(String[] args) {

        AM_Protected_Parent a = new AM_Protected_Parent();
        a.superClassFunction();
        System.out.println("Variable is accessed in another class same package : "+a.age);
        AM_Protected_Child b = new AM_Protected_Child();
        b.sbFunction();
    }
}

class AM_Protected_Parent {
    protected int age = 60;
    void superClassFunction() {
        System.out.println("Variable is accessed in same class : "+age);
    }
}
class AM_Protected_Child extends AM_Protected_Parent {
    void sbFunction()
    {
        System.out.println("Variable is accessed in subclass : "+age);
    }
}

/*
OUTPUT:
Variable is accessed in same class : 60
Variable is accessed in another class in same package : 60
Variable is accessed in subclass : 60
 */
