package ex_08_Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Multiple_Inheritance {
    public static void main(String[] args) {
        System.out.println("In java Multiple Inheritance is not possible using 'extends' keyword.");
        System.out.println("It is possible in Java using interface and 'implements' keyword'");
    }
    class father {
        void assetsF() {
            System.out.println("1 Cr Rupees");
        }
    }
    class mother {
        void assestsM()
        {
            System.out.println("5 KG Gold");
        }
    }
    // public class son extends mother,father
    // In java Multiple Inheritance is not possible using 'extends' keyword.
}
/*
OUTPUT:
In java Multiple Inheritance is not possible using 'extends' keyword.
It is possible in Java using interface and 'implements' keyword'
 */