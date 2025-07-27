package ex_14_Keywords;

public class KW_this {
    public static void main(String[] args) {
        System.out.println("Details of Employee : ");
        kw_this emp1 = new kw_this(7,1400000);
        System.out.println("Years of Experience : "+emp1.yearsofex);
        System.out.println("Salary : "+emp1.salary);
    }
    public static class kw_this {
        int yearsofex;
        int salary;
        kw_this(int yearsofex, int salary) {
            this.yearsofex = yearsofex;
            this.salary = salary;
        }
    }
}
/*
OUTPUT:
Details of Employee :
Years of Experience : 7
Salary : 1400000
 */
