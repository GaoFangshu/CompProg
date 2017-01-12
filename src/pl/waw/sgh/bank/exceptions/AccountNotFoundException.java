package pl.waw.sgh.bank.exceptions;

/**
 * Created by prubac on 14.12.2016.
 */
public class AccountNotFoundException extends BankException {

    public AccountNotFoundException(String s) {
        super(s);
    }
}
