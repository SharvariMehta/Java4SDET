package ex_16_Exception_Handling;

public class exception_Handling_2 {
    public static void main(String[] args) {
        String s1 = null;
        try {
            String s2 = s1.trim();// NullPointerException
        } catch (NullPointerException | ArithmeticException e) {    //sr qa way
            System.out.println("Exception Reason : "+e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
/*
OUTPUT:
Exception Reason : Cannot invoke "String.trim()" because "s1" is null
 */