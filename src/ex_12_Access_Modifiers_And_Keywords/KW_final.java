package ex_12_Access_Modifiers_And_Keywords;

public class KW_final {
    public static void main(String[] args) {
        final int max_users  = 1000;
        System.out.println(max_users);
        // max_users = 200; ❌ Gives error : Cannot assign a value to final variable 'max_users'

        //Without using keyword Final:
        int a = 100;
        System.out.println(a);
        a = 200;
        System.out.println(a);

        Animal2 a2 = new Animal2();
        a2.makeaction();
    }

    //with Final Keyword
    class Animal1 {
        final void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }
    class Dog1 extends Animal1 {
         //void makeSound() {}  // ❌ Error: cannot override final method
    }
    //without Final Keyword
    static class Animal2 {
        void makeaction() {
            System.out.println("Bark");
        }
    }
    class Dog2 extends Animal2 {
        void makeaction() {
            System.out.println("Sound");  //Able to declare without any error
        }
    }
}

/*
OUTPUT:
1000
100
200
Bark
 */