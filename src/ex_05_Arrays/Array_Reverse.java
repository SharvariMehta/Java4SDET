package ex_05_Arrays;

public class Array_Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.print("Reverse of array n is : ");
        for(int i = arr.length-1; i>=0; i--)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
/*
OUTPUT:
Reverse of array n is :  6 5 4 3 2 1
 */