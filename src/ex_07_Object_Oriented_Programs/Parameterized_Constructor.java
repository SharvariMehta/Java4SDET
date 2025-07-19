package ex_07_Object_Oriented_Programs;

public class Parameterized_Constructor {
    public static void main(String[] args) {

        System.out.println("Details of Car1 : ");
        car c1 = new car("Tesla",2012,"QQQ");
        System.out.println(c1.name + " " + c1.year + " " + c1.model);
        c1.moves();

        System.out.println();

        System.out.println("Details of Car2 : ");
        car c2 = new car("Scorpio",2022,"AAA");
        System.out.println(c2.name + " " + c2.year + " " + c2.model);
        c2.moves();
    }

    public static class car {

        String name;
        int year;
        String model;

        void moves()
        {
            System.out.println(this.name + " Moves at great speed !");
        }

        car(String name, int year, String model){
            this.name = name;
            this.year = year;
            this.model = model;
        }
    }
}
/*
OUTPUT:
Details of Car1 :
Tesla 2012 QQQ
Tesla Moves at great speed !

Details of Car2 :
Scorpio 2022 AAA
Scorpio Moves at great speed !
 */