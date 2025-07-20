package ex_08_Inheritance;

public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        System.out.println("Assets of Kishanlal : ");
        Father k = new Father();
        k.Kishanlal();

        System.out.println();

        System.out.println("Total Assets of Amar Include : ");
        son1 Amar = new son1();
        Amar.Kishanlal();
        Amar.Amar();

        System.out.println();

        System.out.println("Total Assets of Akbar Include: ");
        son2 Akbar = new son2();
        Akbar.Kishanlal();
        Akbar.Akbar();

        System.out.println();

        System.out.println("Total Assets of Anthony Include: ");
        son3 Anthony = new son3();
        Anthony.Kishanlal();
        Anthony.Anthony();
    }
    public static class Father{
        void Kishanlal()
        {
            System.out.println("Assets of Kishanlal");
        }
    }
    public static class son1 extends Father{
        void Amar()
        {
            System.out.println("Assets of Amar");
        }

    }
    public static class son2 extends Father{
        void Akbar()
        {
            System.out.println("Assets of Akbar");
        }
    }
    public static class son3 extends Father{
        void Anthony()
        {
            System.out.println("Assets of Anthony");
        }
    }
}
/*
OUTPUT:
Assets of Kishanlal :
Assets of Kishanlal

Total Assets of Amar Include :
Assets of Kishanlal
Assets of Amar

Total Assets of Akbar Include:
Assets of Kishanlal
Assets of Akbar

Total Assets of Anthony Include:
Assets of Kishanlal
Assets of Anthony
 */