package ex_12_Access_Modifiers;
//Accessed in same class, another class and same package
//NOT accessed in child class
public class AM_Default {
    int sal = 7;
    void sameClass() {
        System.out.println("Variable is accessed in same Class : "+sal);
    }
    public static void main(String[] args) {
        AM_Default d1 = new AM_Default();
        d1.sameClass();
        int s1 = d1.sal;
        System.out.println("Variable is accessed in Another Class : "+s1);
        samePackage sp = new samePackage();
        sp.samePackageAccess();
    }
}
class samePackage {
    void samePackageAccess() {
        AM_Default d2 = new AM_Default();
        int s2 = d2.sal;
        System.out.println("Variables are accessed in same Package : "+s2);
    }
}
class childClass extends AM_Default {
    AM_Default d3 = new AM_Default();
    //int s4 = d3.age;  NOT Possible
}
/*
OUTPUT:
Variable is accessed in same Class : 7
Variable is accessed in Another Class : 7
Variables are accessed in same Package : 7
 */