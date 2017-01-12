package pl.waw.sgh.bank;

import pl.waw.sgh.bank.exceptions.AccountNotFoundException;
import pl.waw.sgh.bank.exceptions.IllegalAmountException;
import pl.waw.sgh.bank.exceptions.NotEnoughMoneyException;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by prubac on 30.11.2016.
 */
public class Bank {

    Set<Customer> customerSet = new HashSet<>();

    Set<Account> accountSet = new HashSet<>();

    long lastCustomerId = 0;

    long lastAccountId = 0;

    public Bank() {
    }

    public Customer newCustomer(String firstName, String lastName) {
        lastCustomerId++;
        Customer newCust =
                new Customer(lastCustomerId, firstName, lastName);
        customerSet.add(newCust);
        return newCust;
    }

    public Account newCheckingsAccount(Customer owner) {
        return newAccount(owner, true, "EUR");
    }

    public Account newSavingsAccount(Customer owner) {
        return newAccount(owner, false, "EUR");
    }

    public Account newAccount(Customer owner, boolean isCheckingsAccount,
                              String currency) {
        lastAccountId++;
        Account acc = (isCheckingsAccount ?
                new CheckingsAccount(lastAccountId, currency, owner)
            :
                new SavingsAccount(lastAccountId, currency, owner)
        );
        accountSet.add(acc);
        return acc;
    }


    public Account findAccountByNumber(Long accNum) throws AccountNotFoundException {
        for (Account acc : accountSet) {
            if (acc.getAccountNumber().equals(accNum))
                return acc;
        }
        throw new AccountNotFoundException("Account number: " + accNum + " was not found");
    }


    public void deposit(Long accNum, BigDecimal amount)
            throws AccountNotFoundException, IllegalAmountException {
        Account account = findAccountByNumber(accNum);
        account.deposit(amount);
        //if (account==null) return false;
        //account.setBalance(account.getBalance().add(amount));
    }

    public void charge(Long accNum, BigDecimal amount)
            throws AccountNotFoundException,
            IllegalAmountException,
            NotEnoughMoneyException {
        Account account = findAccountByNumber(accNum);
        account.charge(amount);
    }

    public void transfer(Long fromAccNum, Long toAccNum, Double amount)
            throws AccountNotFoundException, IllegalAmountException, NotEnoughMoneyException {
        transfer(fromAccNum, toAccNum, new BigDecimal(amount));
    }

    public void transfer(Long fromAccNum, Long toAccNum, BigDecimal amount) throws AccountNotFoundException, IllegalAmountException, NotEnoughMoneyException {
        // Not correct because toAccount may not be found and
        // fromAccount was already charged...
        //findAccountByNumber(fromAccNum).charge(amount);
        //findAccountByNumber(toAccNum).deposit(amount);
        Account accFrom = findAccountByNumber(fromAccNum);
        Account accTo = findAccountByNumber(toAccNum);
        accFrom.charge(amount);
        accTo.deposit(amount);
    }


    @Override
    public String toString() {
        return "Bank{" +
                "customerSet=\n" + customerSet +
                "\naccountSet=\n" + accountSet +
                "\n}";
    }
}
