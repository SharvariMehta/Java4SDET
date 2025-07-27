package ex_16_Exception_Handling;

public class throwsVSthrow_ex {
    public static void main(String[] args) throws ArithmeticException {
        try {
            dividebyzero(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void dividebyzero(int a) {
        if (a == 0) {
            throw new ArithmeticException("Divide by zero caused Arithmetic Exception !");
        }
    }
}
/*
OUTPUT :
Divide by zero caused Arithmetic Exception !

Process finished with exit code 0
 */
