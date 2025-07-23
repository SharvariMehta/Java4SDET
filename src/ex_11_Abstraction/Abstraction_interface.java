package ex_11_Abstraction;

public class Abstraction_interface {
    public static void main(String[] args) {
        i_taxableIncome ti1 = new i_taxableIncome();
        ti1.gettaxableincome(100,80);
    }
}
interface i_employeeDetails {
    void gettaxableincome(int sal, int rent);
}
class i_taxableIncome implements i_employeeDetails {
    @Override
    public void gettaxableincome(int sal, int rent) {
        System.out.println("Taxable Income is : "+(sal-rent));
    }
}
/*
OUTPUT:
Taxable Income is : 20
 */