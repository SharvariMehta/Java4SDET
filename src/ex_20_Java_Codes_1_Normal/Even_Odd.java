package ex_20_Java_Codes_1_Normal;

public class Even_Odd {
    public static void main(String[] args) {
        int n = 47;
        String Result = (n%2 == 0)? "Even" : "Odd";
        System.out.println("Given Number is : "+Result);
        // Dividend = Divisor * Quotient + Remainder i.e 47 = 2 * 23 + 1;
        System.out.println("Result of Modulus(/) Operator : " + n/2 + " : Returns Quotient");    // / returns Quotient of division
        System.out.println("Result of Division(%) Operator : " + n%2 + " : Returns Remainder");    // % returns Remainder of division
    }
}
/*
OUTPUT:
Given Number is : Odd
Result of Modulus(/) Operator : 23 : Returns Quotient
Result of Division(%) Operator : 1 : Returns Remainder
 */