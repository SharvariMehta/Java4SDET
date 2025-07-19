package ex_07_Object_Oriented_Programs;

public class Classes_And_Objects_1 {
    public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.name = "Tommy";

    Dog d2 = new Dog();
    d2.name = "Jack";

    new Dog().sit();

    System.out.println(d1.greet(d2.name));
    System.out.println(d2.greet(d1.name));

    System.out.println("Both Dogs can to below functions:");
    d1.eat();
    d1.run();
    d1.sleep();
    d1.sit();
    }

    public static class Dog {
        //Attributes || Properties || Data Members || Instance Variables
        String name;
        String Breed;
        String size;
        String color;
        int age;

        //Functions || Methods || Behaviours
        void eat()
        {
            System.out.println("Eating");
        }void sleep()
        {
            System.out.println("Sleeping");
        }void sit()
        {
            System.out.println("Sitting");
        }void run()
        {
            System.out.println("Running");
        }
        String greet(String name)
        {
            return "Hello "+name;
        }
    }

}
