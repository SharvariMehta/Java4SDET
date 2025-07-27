package ex_12_Access_Modifiers;

public class AM_Private {

    public static void main(String[] args) {
        AMprivate ap = new AMprivate();
        System.out.print("Variable is accessed in same class only : ");
        ap.showAge();       // Accessed in same Class
    }
    static class AMprivate {
        private int age =50;
        void showAge()
        {
            System.out.println(age);
        }
    }
}
class PrivateAM {
    AM_Private apv = new AM_Private();
    //apv.showAge(); Not possible due to private Keyword
}
/*
OUTPUT:
Variable is accessed in same class only : 50
 */