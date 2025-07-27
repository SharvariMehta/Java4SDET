package ex_16_Exception_Handling;

public class Bank {
    public String currency;
    public Integer amount;

    public Bank(String currency, Integer amount) {
        this.amount = amount;
        this.currency = currency;
    }

    public Integer add(Bank bankname) {
        if(bankname.currency.equals("INR")) {
            return bankname.amount + this.amount;
        }
        else {
            try {
                throw new CustomException("Exception Encountered : Custom Exception Currency Mismatch");
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
}
class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}