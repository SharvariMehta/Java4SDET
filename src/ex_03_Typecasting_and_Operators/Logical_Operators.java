package ex_03_Typecasting_and_Operators;

public class Logical_Operators {
    public static void main(String[] args) {

        boolean JavaIsDifficult = false;
        boolean JavaIsFun = true;

        System.out.println("Logical AND (&&) Example:");
        System.out.println("JavaIsFun && JavaIsDifficult = " + (JavaIsFun && JavaIsDifficult));

        System.out.println("----------");

        System.out.println("Logical OR (||) Example:");
        System.out.println("JavaIsFun || JavaIsDifficult = " + (JavaIsFun || JavaIsDifficult));

        System.out.println("----------");

        System.out.println("Logical NOT (!) Example:");
        System.out.println("!JavaIsFun = " + (!JavaIsFun));
        System.out.println("!JavaIsDifficult = " + (!JavaIsDifficult));

        System.out.println("----------");
    }
}
/*
OUTPUT:
Logical AND (&&) Example:
JavaIsFun && JavaIsDifficult = false
----------
Logical OR (||) Example:
JavaIsFun || JavaIsDifficult = true
----------
Logical NOT (!) Example:
!JavaIsFun = false
!JavaIsDifficult = true
----------
 */
