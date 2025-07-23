package ex_11_Abstraction;

public class Abstraction_interface {
    public static void main(String[] args) {
        i_taxableIncome ti1 = new i_taxableIncome();
        int ti2 = ti1.calculateTaxableIncome();
        System.out.println("Taxable income of employee is : "+ti2);
    }
}
/*
OUTPUT:
Taxable income of employee is : 700000
 */