package ex_05_Arrays;

public class Array_Jagged {
    public static void main(String[] args) {
        int[][] Jagged_Array =
                {
                        {1,2,3},
                        {1,2,3,4,5},
                        {1,2}
                };
        for(int i=0; i<Jagged_Array.length; i++)    // Array_2D.length is number of row
        {
            for(int j=0; j<Jagged_Array[i].length; j++)     //Array_2D[i].length is number of columns
            {
                System.out.print(Jagged_Array[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
/*
OUTPUT:
1 | 2 | 3 |
1 | 2 | 3 | 4 | 5 |
1 | 2 |
 */