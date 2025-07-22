package ex_12_Access_Modifiers_And_Keywords;

public class KW_super {
    public static void main(String[] args) {

        System.out.println("Using super Keyword to access variable(maxspeed) of superclass : ");
        vehicle v = new vehicle();
        v.maxspeed = 200;
        System.out.println("Speed of vehicle as mentioned in parent class : "+v.maxspeed);
        car c1 = new car();
        c1.maxspeed = 100;
        System.out.println("Speed of car as mentioned in child class "+c1.maxspeed);

        System.out.println("\nUsing super Keyword to access constructor(vehicle(int minspeed)) of superclass");
        car c2 = new car(1);

        System.out.println("\nUsing super Keyword to access method(average()) of superclass");
        car c3 = new car();
        c3.display();
    }
    public static class vehicle {
        int maxspeed;
        vehicle() {
            this.maxspeed = maxspeed;
        }
        vehicle(int minspeed) {
            System.out.println("Minimum speed of vehicle is : " +minspeed);
        }
        void average(){
            System.out.println("Average of vehicle is 10 km/hr");
        }
    }
    public static class car extends vehicle {
        car() {
            super.maxspeed = maxspeed;          // Using super Keyword to access variable of superclass
        }
        car(int minspeed) {
            super(0);                   // Using super Keyword to access constructor of superclass
            System.out.println("Minimum speed of car is : "+minspeed);
        }
        void average()
        {
            System.out.println("Average of car is 8 km/hr");
        }
        void display() {
            super.average();                    // Using super keyword to access method of superclass
            average();
        }
    }
}
/*
OUTPUT:
Using super Keyword to access variable(maxspeed) of superclass :
Speed of vehicle as mentioned in parent class : 200
Speed of car as mentioned in child class 100

Using super Keyword to access constructor(vehicle(int minspeed)) of superclass
Minimum speed of vehicle is : 0
Minimum speed of car is : 1

Using super Keyword to access method(average()) of superclass
Average of vehicle is 10 km/hr
Average of car is 8 km/hr
 */