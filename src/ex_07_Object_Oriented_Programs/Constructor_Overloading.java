package ex_07_Object_Oriented_Programs;

public class Constructor_Overloading {
    public static void main(String[] args) {

        person p1 = new person("Sharvari",28,"Pune");
        person p2 = new person("Prajakta","Ratnagiri");

        System.out.println("Details of person 1 : "+p1.name + " " + p1.age + " " +p1.address);
        System.out.println("Details of person 2 : "+p2.name + " " + p2.age + " " +p2.address);
    }
    public static class person{
        String name;
        int age;
        String address;

        person(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        person(String name, String address)    //Constructor Overloading
        {
            this.name = name;
            this.address = address;
        }
    }
}
/*
Details of person 1 : Sharvari 28 Pune
Details of person 2 : Prajakta 0 Ratnagiri //Prints 0 as default value of integer is 0 in Java
 */