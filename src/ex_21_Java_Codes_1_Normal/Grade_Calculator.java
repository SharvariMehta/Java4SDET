package ex_21_Java_Codes_1_Normal;

public class Grade_Calculator {
    public static void main(String[] args) {
    int r = 81;

    String G = (r > 90) ? "A" : ((r>80)? "B" : ((r>70)? "C" : ((r>60)?  "D" : "F")) );
    System.out.println("Grade of student calculated using Ternary Operator is : " +G);
    }
}
/*
OUTPUT:
Grade of student calculated using Ternary Operator is : B
 */