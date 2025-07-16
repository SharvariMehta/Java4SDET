package ex_05_Arrays;

public class Array_Max_Min {
    public static void main(String[] args) {
        int[] n = {10, 20, 90, 40, 50, 80};

        int maxnum = maximum(n);
        System.out.println("Maximum Number in Array n is : " + maxnum);

        int minnum = minimum(n);
        System.out.println("Minimum Number in Array n is : "+minnum);
    }

    public static int maximum(int[] n) {
        int max = n[0];
        for (int i = 0; i < n.length; i++)
        {
            if(max<n[i])
                max = n[i];
        }
        return max;
    }

    public static int minimum(int[] n)
    {
        int min = n[0];
        for(int i=0; i<n.length; i++)
        {
            if(min>n[i])
            {
                min = n[i];
            }
        }
        return min;
    }
}
/*
OUTPUT:
Maximum Number in Array n is : 90
Minimum Number in Array n is : 10
 */