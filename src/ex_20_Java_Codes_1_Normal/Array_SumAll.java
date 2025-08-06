package ex_20_Java_Codes_1_Normal;

public class Array_SumAll {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0; i<a.length;i++)
        {
            sum = sum +a[i];
        }
        System.out.println("Sum of all elements in Array is : "+sum);
    }
}
/*
OUTPUT:
Sum of all elements in Array is : 55
 */