package ex_05_Arrays;

public class Array_Max_Min {
    public static void main(String[] args) {

        int[] n = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};

        int maxnum = maximumfunction(n);
        System.out.println("Maximum Number in Array is : "+maxnum);

        int minnum = minimumfunction(n);
        System.out.println("Minimum Number in Array is : "+minnum);
    }

    private static int minimumfunction(int[] n) {
        int min = n[0];
        for(int i=0; i<n.length; i++)
        {
            if(min>n[i])
                min = n[i];
        }
        return min;
    }

    private static int maximumfunction(int[] n) {
        int max = n[0];
        for(int i=0; i<n.length; i++)
        {
            if(max<=n[i])
                max = n[i];
        }
        return max;
    }
}
/*
OUTPUT:
Maximum Number in Array is : 9
Minimum Number in Array is : 0
 */