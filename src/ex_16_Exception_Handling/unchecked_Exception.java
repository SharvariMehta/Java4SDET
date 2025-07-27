package ex_16_Exception_Handling;

public class unchecked_Exception {
    public static void main(String[] args) {
        System.out.println("Enter a number to be divided by 100 : ");
        String user_input = args[0];            // ArrayIndexOutOfBoundsException
        int n = Integer.parseInt(user_input);   // NumberFormatException
        int a = 100/n;                          // ArithmeticException

        System.out.printf("Answer of %d divided by 100 is : ",n);
        System.out.println(a);

        String s = null;
        s.trim();// NullPointerException
    }
}
/*
OUTPUT 1: Below exception occurred as we did not give value of args[0]
Enter a number to be divided by 100 :
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at ex_16_Exception_Handling.unchecked_ExceptionHandling.main(unchecked_ExceptionHandling.java:8)

OUTPUT2:
Enter a number to be divided by 100 :
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:564)
	at java.base/java.lang.Integer.parseInt(Integer.java:661)
	at ex_16_Exception_Handling.unchecked_ExceptionHandling.main(unchecked_ExceptionHandling.java:9)

OUTPUT3: Below exception occurred as we gave value of args[0] as 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ex_16_Exception_Handling.unchecked_ExceptionHandling.main(unchecked_ExceptionHandling.java:10)

OUTPUT4: Below output is correct as we entered value of args[0] as 10
Enter a number to be divided by 100 :
Answer of 10 divided by 100 is : 10

OUTPUT5: Below Exception has occurred because we asked jvm to trim a null string
Enter a number to be divided by 100 : 
Answer of 10 divided by 100 is : 10
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.trim()" because "s" is null
	at ex_16_Exception_Handling.unchecked_ExceptionHandling.main(unchecked_ExceptionHandling.java:16)
 */
