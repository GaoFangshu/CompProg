package pl.waw.sgh.bank;

import java.math.BigDecimal;

/**
 * Created by prubac on 30.11.2016.
 */
public class CheckingsAccount extends Account {

    public CheckingsAccount(Long accountNumber, Customer owner) {
        super(accountNumber, owner);
    }

    public CheckingsAccount(Long accountNumber, String currency, Customer owner) {
        super(accountNumber, currency, owner);
    }
}
