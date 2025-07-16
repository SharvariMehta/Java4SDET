package ex_05_Arrays;

public class Array_Using_CLI {
    public static void main(String[] args) {
        System.out.print("Array Elements Printed using CLI : ");
        for(int i=0; i<args.length; i++)
        {
            System.out.print(args[i]+ " ");
        }
    }
}
/*
OUTPUT:
Array Elements Printed using CLI : 10 20 30 90 80 70
 */
