package ex_06_Strings;

public class StringBuffer_Methods {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println("Value of sbf is : "+sbf);
        System.out.println("Value of sbf after Appending is : "+sbf.append("Programming"));
        System.out.println("Value of sbf after deleting chars from 4 to 16 is : "+sbf.delete(4,16));
        System.out.println("Value of sbf after inserting 2025 in it is : "+sbf.insert(2,2025));
        System.out.println("Value after reversing sbf : "+sbf.reverse());
    }
}
/*
Value of sbf is : Java
Value of sbf after Appending is : JavaProgramming
Value of sbf after deleting chars from 4 to 16 is : Java
Value of sbf after inserting 2025 in it is : Ja2025va
Value after reversing sbf : av5202aJ
 */