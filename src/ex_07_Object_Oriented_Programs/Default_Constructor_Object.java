package ex_07_Object_Oriented_Programs;

public class Default_Constructor_Object {
    public static void main(String[] args) {
        car c1 = new car();
        c1.name = "Tesla";  // Assigned  new value to name attribute
        System.out.println("Name of Car : "+c1.name);
        System.out.println("Manufacturing Year of Car : "+c1.year);
        System.out.println("Model of Car : "+c1.model);
    }
    public static class car{
        String name;
        int year;
        String model;

        car(){
            name = "Audi";
            year = 1997;
            model = "XXX";
        }
    }
}
/*
OUTPUT Before defining default values in Default Constructor
Name of Car : null
Manufacturing Year of Car : 0
Model of Car : null

OUTPUT After defining default values in Default Constructor
Name of Car : Audi
Manufacturing Year of Car : 1997
Model of Car : XXX

OUTPUT After Assigning new value to name attribute
Name of Car : Tesla
Manufacturing Year of Car : 1997
Model of Car : XXX
 */