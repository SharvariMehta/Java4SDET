package ex_08_Inheritance;

import java.sql.SQLOutput;

public class MultiLevel_Inheritance {
    public static void main(String[] args) {

        GrandFather gf = new GrandFather();
        System.out.println("Assets on Grandfather's name : ");
        gf.assetsGf();

        System.out.println();

        Father f = new Father();
        System.out.println("Assets on Father's name : ");
        f.assetsF();
        f.assetsGf();

        System.out.println();

        Son s = new Son();
        System.out.println("Assets on Son's name : ");
        s.assetsS();
        s.assetsF();
        s.assetsGf();
    }

    public static class GrandFather {
        void assetsGf(){
            System.out.println("1 Acre Land");
            System.out.println("10 KG Gold");
        }
    }
    public static class Father extends GrandFather{
        void assetsF()
        {
            System.out.println("3 BHK Flat");
            System.out.println("5 KG Gold");
        }
    }
    public static class Son extends Father {
        void assetsS() {
            System.out.println("2 BHK Flat");
            System.out.println("1 KG Gold");
        }
    }
}
/*
OUTPUT:
Assets on Grandfather's name :
1 Acre Land
10 KG Gold

Assets on Father's name :
3 BHK Flat
5 KG Gold
1 Acre Land
10 KG Gold

Assets on Son's name :
2 BHK Flat
1 KG Gold
3 BHK Flat
5 KG Gold
1 Acre Land
10 KG Gold

 */