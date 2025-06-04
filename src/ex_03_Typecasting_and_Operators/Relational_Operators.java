package ex_03_Typecasting_and_Operators;

public class Relational_Operators {     //Also known as comparison Operators
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 10;

        System.out.println("Result of a == b : "+ (a == b));
        System.out.println("Result of a != b : "+ (a != b));
        System.out.println("Result of a >= c : "+ (a >= c));
        System.out.println("Result of a <= b : "+ (a <= b));
        System.out.println("Result of a > c : "+ (a > c));
        System.out.println("Result of a < b : "+ (a < b));
    }
}
/*
OUTPUT:
Result of a == b : false
Result of a != b : true
Result of a >= c : true
Result of a <= b : false
Result of a > c : true
Result of a < b : false
 */