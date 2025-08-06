package ex_20_Java_Codes_1_Normal;

public class Array_SmallestNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int s = 0;

        for(int i=0; i<a.length; i++) {
            s = a[0];
            if(a[0]>a[i]) {
                s=a[i];
            }
        }
        System.out.println("Smallest number in Array is : "+s);
    }
}
/*
Smallest number in Array is : 1
 */