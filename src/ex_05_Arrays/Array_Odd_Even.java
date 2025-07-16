package ex_05_Arrays;

public class Array_Odd_Even {
    public static void main(String[] args) {

        int[] n = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Even Numbers in Array are : ");
        for(int i=0; i<n.length; i++)
        {
            if((n[i] % 2) == 0)
            {
                System.out.print(n[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Odd Numbers in Array are : ");
        for(int i=0; i<n.length; i++)
        {
            if((n[i] % 2) != 0)
            {
                System.out.print(n[i]+ " ");
            }
        }
    }
}
/*
OUTPUT:
Even Numbers in Array are : 2 4 6 8 10
Odd Numbers in Array are : 1 3 5 7 9
 */