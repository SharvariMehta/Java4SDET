package ex_16_Exception_Handling;

public class exception_Handling_3 {
    public static void main(String[] args) {
        int n = 0;
        String user_input = "10";            // ArrayIndexOutOfBoundsException
        try {
            user_input = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Reason for args[0] : "+e.getMessage());
        }
        try {
            n = Integer.parseInt(user_input);   // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Exception Reason for Integer.parseInt(user_input) : "+e.getMessage());
        }
        System.out.println(n);
    }
}
/*
OUTPUT : when input is blank
Exception Reason for args[0] : Index 0 out of bounds for length 0
Exception Reason for Integer.parseInt(user_input) : Cannot parse null string

OUTPUT : when input is string "abc"
Exception Reason for Integer.parseInt(user_input) : For input string: "abc"

OUTPUT : when input is 0
Exception Reason for args[0] : Index 0 out of bounds for length 0

OUTPUT : when input is 10
Exception Reason for args[0] : Index 0 out of bounds for length 0
10
 */