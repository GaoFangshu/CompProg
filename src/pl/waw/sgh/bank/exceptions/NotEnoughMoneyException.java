package pl.waw.sgh.bank.exceptions;

/**
 * Created by prubac on 14.12.2016.
 */
public class NotEnoughMoneyException extends BankException {

    public NotEnoughMoneyException(String s) {
        super(s);
    }
}
