package ex_16_Exception_Handling;

public class exception_Handling {
    public static void main(String[] args) {
        int n = 0;
        try {
            n = 100/0;
        } catch (Exception e) {
            System.out.println("Arithmetic Exception : "+e.getMessage());
        }
        System.out.println("Answer of 100/0 is : "+n);
    }
}
/*
OUTPUT:
Arithmetic Exception : / by zero
Answer of 100/0 is : 0
 */