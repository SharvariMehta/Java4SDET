package ex_11_Abstraction;

public class i_taxableIncome implements i_employeeDetails {
    //@Override
    public int calculateTaxableIncome()
    {
       int taxableIncome = sal - rent;
       return taxableIncome;
    }
}
