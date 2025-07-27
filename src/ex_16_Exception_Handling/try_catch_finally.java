package ex_16_Exception_Handling;

public class try_catch_finally {
    public static void main(String[] args) {
        int c = 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println("Catch Block !");
            System.out.println("Exception Reason : "+e.getMessage());
        } finally {
            System.out.println("Finally Block !");
        }
        System.out.println(c);
    }
}
/*
OUTPUT:
Catch Block !
Exception Reason : / by zero
Finally Block !
0

Process finished with exit code 0
 */