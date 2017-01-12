package pl.waw.sgh.bank;

import java.math.BigDecimal;

/**
 * Created by prubac on 30.11.2016.
 */
public class SavingsAccount extends Account {

    public SavingsAccount(Long accountNumber, Customer owner) {
        super(accountNumber, owner);
    }

    public SavingsAccount(Long accountNumber, String currency, Customer owner) {
        super(accountNumber, currency, owner);
    }
}
