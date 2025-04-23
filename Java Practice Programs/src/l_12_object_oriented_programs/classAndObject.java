package l_12_object_oriented_programs;
/*
 * This declares that class is part of the l12_object_oriented_programs package.
 * Packages help organize related classes together, like folders.
 */

class Student {
    int rno;
    String name;
    float marks;
}

public class classAndObject {

    public static void main(String[] args) {
        Student sharvari = new Student();
/*
 * Creates a new object sharvari of type Student using the new keyword.
 * This allocates memory for the object and allows you to access its variables.
 */
        sharvari.rno = 12;
        sharvari.name = "sharvari";
        sharvari.marks = 12.5f;

        System.out.println("Roll No: " + sharvari.rno);
        System.out.println("Name: " + sharvari.name);
        System.out.println("Marks: " + sharvari.marks);
    }
}
