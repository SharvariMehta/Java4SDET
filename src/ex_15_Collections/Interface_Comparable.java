package ex_15_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Interface_Comparable {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sharvari");
        Student s2 = new Student(103, "Prajakta");
        Student s3 = new Student(100, "Shraddha");
        ArrayList StudentList = new ArrayList();
        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);
        Collections.sort(StudentList);
        System.out.println(StudentList);
    }
}
class Student implements Comparable<Student> {

    private int rollno;
    private String name;
    // Parametrized Constructor :
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    // Convert to String Function
    @Override
    public String toString() {
        return "Student{" +
                "rollno='" + rollno + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    // Code to sort data by rollno :
    @Override
    public int compareTo(Student o) {
        return this.rollno - o.rollno;
    }
    /* Code to sort data by name
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
    */
}
/*
OUTPUT : when data is sorted by name :
[Student{rollno='103', name='Prajakta'}, Student{rollno='101', name='Sharvari'}, Student{rollno='100', name='Shraddha'}]
OUTPUT : when data is sorted by rollno :
[Student{rollno='100', name='Shraddha'}, Student{rollno='101', name='Sharvari'}, Student{rollno='103', name='Prajakta'}]
 */
