package ex_05_Arrays;

public class Array_Sum {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6};

        int sum1 = 0;
        for(int i =0; i<n.length; i++)
        {
            sum1 = sum1 + n[i];
        }
        System.out.println("Sum of all Elements in Array using for loop is : "+sum1);

        int sum2 = 0;
        for(int s : n)
        {
             sum2 = s + sum2;
        }
        System.out.println("Sum of all Elements in Array using for-each loop is : "+sum2);
    }
}
/*
OUTPUT:
Sum of all Elements in Array using for loop is : 21
Sum of all Elements in Array using for-each loop is : 21
 */