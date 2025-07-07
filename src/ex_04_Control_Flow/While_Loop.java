package ex_04_Control_Flow;

public class While_Loop {
    public static void main(String[] args) {

        System.out.println("While Loop with Increment Operator : ");
        int i = 1;
        while (i <= 10)
        {
            System.out.print(" "+i);
            i++;
        }

        System.out.println("\nWhile Loop with Decrement Operator : ");
        int j = 10;
        while(j >= 1)
        {
            System.out.print(" "+j);
            j--;
        }
    }
}
/*
OUTPUT:
While Loop with Increment Operator :
 1 2 3 4 5 6 7 8 9 10
While Loop with Decrement Operator :
 10 9 8 7 6 5 4 3 2 1
 */