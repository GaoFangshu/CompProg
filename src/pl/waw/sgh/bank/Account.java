package pl.waw.sgh.bank;

import pl.waw.sgh.bank.exceptions.IllegalAmountException;
import pl.waw.sgh.bank.exceptions.NotEnoughMoneyException;

import java.math.BigDecimal;

/**
 * Created by prubac on 30.11.2016.
 */
public abstract class Account {

    private Long accountNumber;

    private String currency = "EUR";

    private BigDecimal balance = new BigDecimal(0);

    private Customer owner;

    private Boolean isActive = true;

    public Account(Long accountNumber, Customer owner) {
        this(accountNumber, "EUR", owner);
    }

    public Account(Long accountNumber, String currency, Customer owner) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.owner = owner;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public void charge(BigDecimal amount)
            throws NotEnoughMoneyException, IllegalAmountException {
        if (amount.compareTo(BigDecimal.ZERO)<0)
            throw new IllegalAmountException(
                    "Amount may not be a negative number");
        if (amount.compareTo(balance)>0)
            throw new NotEnoughMoneyException(
                    "Account number" + accountNumber + " only has "
                            + balance);
        setBalance(balance.subtract(amount));
    }

    public void deposit(BigDecimal amount) throws IllegalAmountException {
        if (amount.compareTo(BigDecimal.ZERO)<0)
            throw new IllegalAmountException(
                    "Amount may not be a negative number");
        setBalance(balance.add(amount));
    }



    @Override
    public String toString() {
        return this.getClass().getSimpleName().replace("Account", "") + "{" +
                "#" + accountNumber +
                ", " + currency +
                " " + balance +
                ", owner=" + owner.getLastName() +
                (!isActive ? ", NOT ACTIVE" : "") +
                '}';
    }
}
