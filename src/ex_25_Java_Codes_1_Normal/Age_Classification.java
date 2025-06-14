package ex_25_Java_Codes_1_Normal;

public class Age_Classification {
    public static void main(String[] args) {
        int age = 6;
        String Class = (age>50)? "Senior Citizen" : ((age > 22)? "Working Class" : ((age>5)? "Student" : "Child" ));
        System.out.println("Class as per age is : "+Class);
    }
}
/*
OUTPUT:
Class as per age is : Student
 */