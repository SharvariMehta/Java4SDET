package ex_09_Polymorphism;

public class Method_OverLoading {
    public static void main(String[] args) {
        MathOperation m1 = new MathOperation();

        int a = m1.add(10,20,30);
        System.out.println("Datatype Integer and Addition of 3 arguments : "+a);

        int b = m1.add(10,20);
        System.out.println("Datatype Integer and Addition of 2 arguments : "+b);

        double c = m1.add(10.21,11.21);
        System.out.println("Datatype double and Addition of 2 arguments : "+c);
    }
    static class MathOperation {
        int add(int n1, int n2, int n3){
            return n1+n2+n3;
        }
        int add(int n1, int n2) {
            return n1+n2;
        }
        double add(double n1, double n2) {
            return n1+n2;
        }
    }
}
/*
OUTPUT:
Datatype Integer and Addition of 3 arguments : 60
Datatype Integer and Addition of 2 arguments : 30
Datatype double and Addition of 2 arguments : 21.42
 */