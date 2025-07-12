package ex_20_Java_Codes_1_Normal;

import java.util.Scanner;

public class Arithmetic_Operations_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a : ");
        int a=0;
        if(sc.hasNextInt())
            a = sc.nextInt();
        else
        {
            System.out.println("Please Enter Numeric Value");
            System.exit(0);
        }

        System.out.println("Enter value of b : ");
        int b=0;
        if(sc.hasNextInt())
            b= sc.nextInt();
        else
        {
            System.out.println("Please Enter Numeric Value");
            System.exit(0);
        }
        if(b == 0)
        {
            System.out.println("Division by Zero is not possible !");
            System.exit(0);
        }
        System.out.println("Addition of a and b = "+sum(a,b));
        System.out.println("Substraction of a and b = "+sub(a,b));
        System.out.println("Multiplication of a and b = "+mul(a,b));
        System.out.println("Division of a and b = "+div(a,b));
        System.out.println("Modulus of a and b = "+mod(a,b));
    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int div(int a, int b)
    {
        return a%b;
    }
    static int mod(int a, int b)
    {
        return a/b;
    }

}
/*
OUTPUT 1:
Enter value of a :
15
Enter value of b :
5
Addition of a and b = 20
Substraction of a and b = 10
Multiplication of a and b = 75
Division of a and b = 0
Modulus of a and b = 3

OUTPUT2:
Enter value of a :
10
Enter value of b :
0
Division by Zero is not possible !

OUTPUT 3:
Enter value of a :
T
Please Enter Numeric Value
 */