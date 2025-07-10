package ex_07_Object_Oriented_Programs;

public class User_Defined_Function {
    public static void main(String[] args) {
        //1. Without Parameters and Without Return Type.
        System.out.print("Without Parameters and Without Return Type : ");
        function1();

        //2. Without Parameters but With Return Type.
        System.out.print("Without Parameters but With Return Type : ");
        String op = function2();
        System.out.println(op);

        //3. With Parameters and Without Return Type.
        System.out.print("With Parameters and Without Return Type : ");
        function3("Sharvari Mehta", 28, 2000000);

        //4. With Parameters and With Return Type.
        System.out.print("With Parameters and With Return Type : ");
        int r = sum(2,5);
        System.out.print("Sum of a and b = "+r);
    }

    //1. Without Parameters and Without Return Type.
    static void function1()
    {
        System.out.println("HI");
    }

    //2. Without Parameters but With Return Type.
    static String function2()
    {
        return "How are you?";
    }

    //3. With Parameters and Without Return Type.
    static void function3(String name, int age, double salary)
    {
        System.out.println(name + " " + age + " " + salary );
    }

    //4. With Parameters and With Return Type.
    static int sum(int a, int b)
    {
        return a+b ;
    }
}
/*
OUTPUT:
Without Parameters and Without Return Type : HI
Without Parameters but With Return Type : How are you?
With Parameters and Without Return Type : Sharvari Mehta 28 2000000.0
With Parameters and With Return Type : Sum of a and b = 7
 */