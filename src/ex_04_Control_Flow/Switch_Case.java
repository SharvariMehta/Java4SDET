package ex_04_Control_Flow;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number from 1 to 7 : ");
        int day = s.nextInt();

        switch(day)
        {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please Enter Valid Value");
                break;
        }
    }
}
/*
OUTPUT 1:
Enter any number from 1 to 7 : 4
Thursday
OUTPUT 2:
Enter any number from 1 to 7 : 0
Please Enter Valid Value
 */