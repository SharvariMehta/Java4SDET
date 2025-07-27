package ex_16_Exception_Handling;

public class exception_Handling_1 {
    public static void main(String[] args) {
        int n = 0;
        try {
            n = 100/0;
        } catch (ArithmeticException e) {
            System.out.println("It is an arithmetic exception. We got it because : "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Arithmetic Exception : "+e.getMessage());
        }
        System.out.println("Answer of 100/0 is : "+n);
    }
}
/*
OUTPUT with single and common catch block:
Arithmetic Exception : / by zero
Answer of 100/0 is : 0

OUTPUT with multiple and specific catch block
It is an arithmetic exception. We got it because : / by zero
Answer of 100/0 is : 0
 */