package ex_11_Abstraction;

public class Abstraction_abstractClass {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.loan50k();
        c1.loan25k();
        // Instance of Father cannnot be created as its abstract class
    }
}
abstract class Father{
    abstract void loan50k();    // Abstract Function
    void loan25k()              // Normal Function
    {
        System.out.println("Paid 25K");
    }
}
class Child extends Father{
    @Override
    void loan50k() {
        System.out.println("Loan is 50K");
    }
}
/*
OUTPUT:
Loan is 50K
Paid 25K
 */