package ex_07_Object_Oriented_Programs;

public class Classes_And_Objects_2 {
    public static void main(String[] args) {

        Person p = new Person();
        p.one1();   // 1.Without Parameters and Without Return Type

        String n = p.two2();
        System.out.print("2.Without Parameters but With Return Type : ");
        System.out.println("Name is : "+n);     // 2.Without Parameters but With Return Type

        System.out.print("3.With Parameters and Without Return Type : ");
        p.three3(28,2500000);        // 3.With Parameters and Without Return Type

        System.out.print("4.With Parameters and With Return Type : ");
        String a = p.four4("India");
        System.out.println("Lives in "+ a);     // 4.With Parameters and With Return Type
    }

    public static class Person
    {
        // 1.Without Parameters and Without Return Type
        void one1()
        {
            System.out.println("1.Without Parameters and Without Return Type");
        }

        // 2.Without Parameters but With Return Type
        String two2()
        {
            String firstname = "Sharvari";
            String lastname = " Mehta";
            return firstname+lastname;
        }

        //3.With Parameters and Without Return Type
        void three3(int age, int salary)
        {
            System.out.println("Age : "+age+", Salary : "+salary);
        }

        // 4.With Parameters and With Return Type
        String four4(String Address)
        {
            String Address1 = "Baner. Pune ";
            String Address2 = "Maharashtra ";
            return Address1 + Address2 + Address;
        }
    }
}
/*
OUTPUT:
1.Without Parameters and Without Return Type
2.Without Parameters but With Return Type : Name is : SharvariMehta
3.With Parameters and Without Return Type : Age : 28, Salary : 2500000
4.With Parameters and With Return Type : Lives in Baner. Pune Maharashtra India
 */