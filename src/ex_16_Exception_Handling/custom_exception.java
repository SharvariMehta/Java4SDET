package ex_16_Exception_Handling;

public class custom_exception {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR", 200);
        Bank hdfc = new Bank("INR", 500);
        Bank jpmc= new Bank("USD",800);

        int total1 = sbi.add(hdfc);
        System.out.println("Sum of amount in sbi and hdfc is : "+total1);

        int total2 = sbi.add(jpmc);
        System.out.println("Sum of amount in sbi and jpmc is : "+total2);
    }
}
/*
OUTPUT:
Sum of amount in sbi and hdfc is : 700
Exception Encountered : Custom Exception Currency Mismatch
Sum of amount in sbi and jpmc is : 0

Process finished with exit code 0
 */