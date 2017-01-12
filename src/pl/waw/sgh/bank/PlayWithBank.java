package pl.waw.sgh.bank;

import pl.waw.sgh.bank.exceptions.AccountNotFoundException;
import pl.waw.sgh.bank.exceptions.BankException;
import pl.waw.sgh.bank.exceptions.IllegalAmountException;

import java.math.BigDecimal;

/**
 * Created by prubac on 30.11.2016.
 */
public class PlayWithBank {

    public static void main(String[] args) {
          //  throws IllegalAmountException, AccountNotFoundException {
        Bank bank = new Bank();
        Customer c1 = bank.newCustomer("Anne", "Smith");
        bank.newSavingsAccount(c1);
        Account acc2 = bank.newCheckingsAccount(c1);
        Customer c2 = bank.newCustomer("John", "Brown");
        bank.newSavingsAccount(c2);
        bank.newCheckingsAccount(c2);

        System.out.println(bank);
        try {
//            Bank b2 = null;
//            b2.newCustomer("df", "sgsg");
//            //bank.deposit(3L, new BigDecimal(-200));
            bank.deposit(3L, new BigDecimal(200));
            bank.transfer(3L, 2L, 100.00);
            System.out.println(bank);


        } catch (BankException e) {
            System.out.println(e.getMessage());
        }/* catch (IllegalAmountException | AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }*//* catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }*/




    }
}
