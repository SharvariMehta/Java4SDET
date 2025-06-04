package ex_02_Datatypes_Variables;

public class Non_Primitive_Datatypes {
        // Interface: a blueprint for classes
        interface Animal {
            void makeSound();
        }
        // Class implementing an interface
        static class Dog implements Animal {
            String name;
        // Constructor: used to initialize objects
        Dog(String name) {
            this.name = name;
        }

        // Method
        public void makeSound() {
            System.out.println(name + " says: Woof!");
        }
    }
        public static void main(String[] args) {
            System.out.println("---- Non-Primitive Data Types ----");
            // ----- 1. String -----
            String message = "Hello, Java!";
            System.out.println("String example: " + message);

            // ----- 2. Array -----
            int[] numbers = {10, 20, 30, 40, 50};
            System.out.print("Array elements: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            // ----- 3. Object (created from a Class) -----
            Dog myDog = new Dog("Buddy"); // creating an object of Dog
            myDog.makeSound(); // calling method on the object

            // ----- 4. Using Interface -----
            Animal anotherDog = new Dog("Charlie"); // Interface reference to a Dog object
            anotherDog.makeSound(); // polymorphism in action
        }
    }

/*
OUTPUT:
---- Non-Primitive Data Types ----
String example: Hello, Java!
Array elements: 10 20 30 40 50
Buddy says: Woof!
Charlie says: Woof!
 */


