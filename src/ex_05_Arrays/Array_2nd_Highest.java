package ex_05_Arrays;

public class Array_2nd_Highest {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int max1 = -1;
        for(int i=0; i<n.length; i++)
        {
            if(max1<n[i])
                max1 = n[i];
        }

        int max2 = -1;
        for(int i=0; i<n.length; i++)
        {
            if(max2<n[i] && n[i] != max1)
                max2 = n[i];
        }
        System.out.println("Second Highest number in Array is : "+max2);
    }
}
/*
OUTPUT:
Second Highest number in Array is : 14
 */