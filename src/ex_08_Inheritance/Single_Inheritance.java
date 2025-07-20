package ex_08_Inheritance;

public class Single_Inheritance {
    public static void main(String[] args) {

        System.out.println("Father's Property :");
        father f = new father();
        System.out.println(f.gold_kg);
        f.bhk2();

        System.out.println("Son's Property :");
        son s = new son();
        s.bhk3();
        s.bhk2();
        System.out.println(s.gold_kg);
    }

    public static class father
    {
        int gold_kg = 100;  // Attribute
        void bhk2()     // Function
        {
            System.out.println("2 BHK Flat");
        }
    }

    public static class son extends father
    {
        void bhk3()
        {
            System.out.println("3 BHK Flat");
        }
    }
}
/*

OUTPUT before implementing Inheritance using extends keyword :
Father's Property :
100
2 BHK Flat
Son's Property :
3 BHK Flat

OUTPUT after implementing Inheritance using extends keyword :
Father's Property :
100
2 BHK Flat
Son's Property :
3 BHK Flat
2 BHK Flat
100
 */