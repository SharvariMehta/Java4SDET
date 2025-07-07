package ex_03_Typecasting_Operators;

public class Assignment_Operators {
    public static void main(String[] args) {
        System.out.println("------Assignment Operators for Arithmentic Values-----");

        int a = 100;
        int b = 75;
        a += b;
        System.out.println("After a += b, value of a is: " + a);    // a += b; Equivalent to: a = a + b;
        a = 100;    // need to re-declare, as value of a changes after above statement.
        a -= b;
        System.out.println("After a -= b, value of a is: " + a);    // a -= b; Equivalent to: a = a - b;
        a = 100;    // need to re-declare, as value of a changes after above statement.
        a *= b;
        System.out.println("After a *= b, value of a is: " + a);    // a *= b; Equivalent to: a = a * b;
        a = 100;    // need to re-declare, as value of a changes after above statement.
        a /= b;
        System.out.println("After a /= b, value of a is: " + a);    // a /= b; Equivalent to: a = a / b;
        a = 100;    // need to re-declare, as value of a changes after above statement.
        a %= b;
        System.out.println("After a %= b, value of a is: " + a);    // a %= b; Equivalent to: a = a % b;

        System.out.println("------Assignment Operators for Boolean Values-----");
        boolean c = true;
        boolean d = false;
        c &= d;
        System.out.println("After c &= d, value of c is: " + c);    // c &= d; Equivalent to: c = c & d;
        c = true;    // need to re-declare, as value of c changes after above statement.
        c |= d;
        System.out.println("After c |= d, value of c is: " + c);    // c |= d; Equivalent to: c = c | d;

        System.out.println("------Assignment Operators for Binary XOR (^)-----");
        int e = 5;   // Binary: 0101
        int f = 3;   // Binary: 0011
        e ^= f;     // a = a ^ b → 0101 ^ 0011 = 0110 (which is 6)
        System.out.println("After e ^= f, value of e is: " + e);

        System.out.println("------Shift Assignment Operators (>>= and <<=)-----");
        int x = 5;  // Initial value of x. It's Binary: 0000 0101
        System.out.println("Original value of x: " + x);  // Output: 5
        // Using <<= operator (Left shift by 2)
        x <<= 2;  // x = x << 2 → shifts bits to the left by 2 places
        // 0000 0101 << 2 = 0001 0100 (binary) = 20 (decimal)
        System.out.println("After x <<= 2, value of x: " + x);  // Output: 20
        // Using >>= operator (Right shift by 2)
        x >>= 2;  // x = x >> 2 → shifts bits to the right by 2 places
        // 0001 0100 >> 2 = 0000 0101 (binary) = 5 (decimal)
        System.out.println("After x >>= 2, value of x: " + x);  // Output: 5
    }
}
/*
OUTPUT:
------Assignment Operators for Arithmentic Values-----
After a += b, value of a is: 175
After a -= b, value of a is: 25
After a *= b, value of a is: 7500
After a /= b, value of a is: 1
After a %= b, value of a is: 25
------Assignment Operators for Boolean Values-----
After c &= d, value of c is: false
After c |= d, value of c is: true
------Assignment Operators for Binary XOR (^)-----
After e ^= f, value of e is: 6
------Shift Assignment Operators (>>= and <<=)-----
Original value of x: 5
After x <<= 2, value of x: 20
After x >>= 2, value of x: 5
 */