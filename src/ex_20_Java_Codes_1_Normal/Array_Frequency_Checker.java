package ex_20_Java_Codes_1_Normal;

import java.util.HashMap;
import java.util.Map;

public class Array_Frequency_Checker {
    public static void main(String[] args) {
        int[] a = { 1,2,2,3,3,4,4,4,4,5,5,5};
        Map<Integer, Integer> freqmap = new HashMap<>();
        for(int element : a) {
            freqmap.put(element,freqmap.getOrDefault(element,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
/*
OUTPUT:
Element: 1, Frequency: 1
Element: 2, Frequency: 2
Element: 3, Frequency: 2
Element: 4, Frequency: 4
Element: 5, Frequency: 3
 */
