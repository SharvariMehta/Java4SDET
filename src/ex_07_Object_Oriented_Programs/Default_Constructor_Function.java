package ex_07_Object_Oriented_Programs;

public class Default_Constructor_Function {
    public static void main(String[] args) {
        Baby b  = new Baby();
        b.eat();
        b.sleep();
        b.repeat();
    }
    public static class Baby{
        void eat(){
            System.out.println("Eat !");
        }
        void sleep(){
            System.out.println("Sleep !");
        }
        void repeat(){
            System.out.println("Repeat !");
        }
        Baby(){
            System.out.println("I am a Default Constructor ! Called at object creation !");
        }
    }
}
/*
OUTPUT:
I am a Default Constructor ! Called at object creation !
Eat !
Sleep !
Repeat !
 */