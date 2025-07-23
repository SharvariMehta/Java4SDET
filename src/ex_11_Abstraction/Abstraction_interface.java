package ex_11_Abstraction;

public class Abstraction_interface {
    public static void main(String[] args) {
        i_taxableIncome ti1 = new i_taxableIncome();
        int ti2 = ti1.calculateTaxableIncome();
        System.out.println("Taxable income of employee is : "+ti2);
    }
}
interface i_employeeDetails {
    String name = "SharvariMehta";
    int age = 30;
    int sal = 1000000;
    String company = "vois";
    int rent = 300000;
}
class i_taxableIncome implements i_employeeDetails {
    //@Override
    public int calculateTaxableIncome()
    {
        int taxableIncome = sal - rent;
        return taxableIncome;
    }
}
/*
OUTPUT:
Taxable income of employee is : 700000
 */