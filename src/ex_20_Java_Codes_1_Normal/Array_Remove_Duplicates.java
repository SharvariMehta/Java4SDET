package ex_20_Java_Codes_1_Normal;

import java.util.Arrays;
import java.util.HashSet;

public class Array_Remove_Duplicates {
    public static void main(String[] args) {
        Integer[] wdup = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,12,12,90};
        // Convert the array to a Set to automatically remove duplicates
        HashSet<Integer> set = new HashSet<>(Arrays.asList(wdup));
        // Convert the Set back to an array
        Integer[] wodup = set.toArray(new Integer[0]);
        // Correct way to print the array contents
        System.out.println("Array without duplicates: " + Arrays.toString(wodup));
        // Correct way to print the original array contents
        System.out.println("Original array: " + Arrays.toString(wdup));
    }
}
/*
OUTPUT:
Array without duplicates: [1, 2, 3, 4, 5, 6, 7, 8, 12, 90]
Original array: [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 12, 12, 90]
 */