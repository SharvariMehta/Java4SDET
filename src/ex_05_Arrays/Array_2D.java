package ex_05_Arrays;

import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args) {

        int[][] Array_2D = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i=0; i<Array_2D.length; i++)    // Array_2D.length is number of row
        {
            for(int j=0; j<Array_2D[i].length; j++)     //Array_2D[i].length is number of columns
            {
                System.out.print(Array_2D[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
/*
OUTPUT:
1 | 2 | 3 |
4 | 5 | 6 |
7 | 8 | 9 |
 */