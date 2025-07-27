package ex_14_Keywords;

public class KW_enum {
    public static void main(String[] args) {
        System.out.println("Printing Day using enum : "+daysOfWeek2.SUN);
        daysOfWeek1 d = new daysOfWeek1();
        System.out.println("Printing Day using String : "+d.days[0]);
    }
}
class daysOfWeek1 {
    String[] days = {"SUN","MON","TUE","WED","THURS","FRI","SAT"};
}
enum daysOfWeek2 {
    SUN, MON, TUE, WED, THURS, FRI, SAT
}
/*
OUTPUT:
Printing Day using enum : SUN
Printing Day using String : SUN
 */