package ex_05_Arrays;

public class Array_Max_Min {
    public static void main(String[] args) {
        int[] n = {10,20,90,40,50,80};

        int max = n[0];
        for(int i = 0; i<n.length; i++)
        {
            if(max<n[i])
            {
                max = n[i];
            }
        }
        System.out.println("Maximum Number in Array n is : "+max);

        int min = n[0];
        for(int i = 0; i<n.length; i++)
        {
            if(min>=n[i])
            {
                min = n[i];
            }
        }
        System.out.println("Minimum Number in Array n is : "+min);
    }
}
