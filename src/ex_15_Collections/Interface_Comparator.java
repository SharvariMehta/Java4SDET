package ex_15_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Interface_Comparator {
    public static void main(String[] args) {
        Students s1 = new Students(101, "Sharvari");
        Students s2 = new Students(103, "Prajakta");
        Students s3 = new Students(100, "Shraddha");
        ArrayList StudentsList = new ArrayList();
        StudentsList.add(s1);
        StudentsList.add(s2);
        StudentsList.add(s3);
        Collections.sort(StudentsList, new rollnoComparator());
        System.out.println("Sorted by rollno : "+StudentsList);
        Collections.sort(StudentsList, new nameComparator());
        System.out.println("Sorted by name : "+StudentsList);
    }
}
class rollnoComparator implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getRollno()-o2.getRollno();
    }
}
class nameComparator implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class Students{
    private int rollno;
    private String name;
    @Override
    public String toString() {
        return "Students{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public Students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}
/*
Sorted by rollno : [Students{rollno=100, name='Shraddha'}, Students{rollno=101, name='Sharvari'}, Students{rollno=103, name='Prajakta'}]
Sorted by name : [Students{rollno=103, name='Prajakta'}, Students{rollno=101, name='Sharvari'}, Students{rollno=100, name='Shraddha'}]
 */