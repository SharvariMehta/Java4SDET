package ex_05_Arrays;

public class Array_Declaration {
    public static void main(String[] args) {
        //Static Allocation:
        System.out.println("Static Allocation:");
        int[] marks = {10,40,20,30,70};
        for(int  i=0; i<=marks.length-1; i++)
        {
            System.out.print(" "+marks[i]);
        }
        System.out.println();
        System.out.println("Dynamic Allocation:");
        //Dynamic Allocation:
        String[] names = new String[3];
        names[0] = "Sharvari";
        names[1] = "Payal";
        names[2] = "Khushi";
        //names[3] = "Yogesh";
        //Above line gives : java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        for(int i=0; i<=2; i++)
        {
            System.out.print(" "+names[i]);
        }
    }
}
/*
OUTPUT:
Static Allocation:
 10 40 20 30 70
Dynamic Allocation:
 Sharvari Payal Khushi
 */