package ex_05_Arrays;

public class Array_ForEach_Loop {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9};
        System.out.print("Printing an integer array using for-each Loop : ");
        for(int i : n)
        {
            System.out.print(i+" ");
        }

        System.out.println();

        String[] fruits = {"apples", "mangoes", "oranges"};
        System.out.print("Printing a String Array using For-each Loop : ");
        for(String i : fruits)
        {
            System.out.print(i+" ");
        }
    }
}
/*
OUTPUT:
Printing an integer array using for-each Loop : 1 2 3 4 5 6 7 8 9
Printing a String Array using For-each Loop : apples mangoes oranges
 */