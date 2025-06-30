package ex_25_Java_Codes_1_Normal;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Side of Triangle : ");
        int s1 = sc.nextInt();
        System.out.print("Enter Second Side of Triangle : ");
        int s2 = sc.nextInt();
        System.out.print("Enter third Side of Triangle : ");
        int s3 = sc.nextInt();

        if(s1 == s2 && s2 == s3)
            System.out.println("Triangle is Equilateral Triangle");
        else if(s1 == s2 || s2 == s3 || s3 == s1)
            System.out.println("Triangle is Isosceles Triangle");
        else
            System.out.println("Triangle is Scalene Triangle");
    }
}
/*
OUTPUT 1:
Enter First Side of Triangle : 10
Enter Second Side of Triangle : 10
Enter third Side of Triangle : 10
Triangle is Equilateral Triangle
OUTPUT 2:
Enter First Side of Triangle : 12
Enter Second Side of Triangle : 12
Enter third Side of Triangle : 14
Triangle is Isosceles Triangle
OUTPUT 3:
Enter First Side of Triangle : 11
Enter Second Side of Triangle : 12
Enter third Side of Triangle : 14
Triangle is Scalene Triangle
 */