package pl.waw.sgh.bank.ui.dawid;

import pl.waw.sgh.bank.Account;
import pl.waw.sgh.bank.Bank;
import pl.waw.sgh.bank.Customer;
import pl.waw.sgh.bank.exceptions.AccountNotFoundException;
import pl.waw.sgh.bank.exceptions.BankException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

/**
 * Created by oki on 2017-01-04.
 * Edited by Fangshu Gao on 2017-01-05.
 */
public class BankForm {
    private JTextField idDeposit;
    private JTextField amountDeposit;
    private JTextField idTransfer;
    private JTextField idTransferTo;
    private JTextField amountTransfer;
    private JTextField amountWithdraw;
    private JTextField idWithdraw;
    private JButton checkDeposit;
    private JButton checkWithdraw;
    private JButton checkTransfer;
    private JTextField accountIDTField;
    private JButton checkButton;

    private JPanel mainPanel;
    private JTextField balanceTField;
    private JLabel blankLeft;
    private JLabel blankBotton;
    private JLabel blankRight;

    private Bank bank;

    public void init() {
        bank = new Bank();
        Customer c1 = bank.newCustomer("Anne", "Smith");
        bank.newSavingsAccount(c1);
        Account acc2 = bank.newCheckingsAccount(c1);
        Customer c2 = bank.newCustomer("John", "Brown");
        bank.newSavingsAccount(c2);
        bank.newCheckingsAccount(c2);

        System.out.println(bank);
        try {
            bank.deposit(3L, new BigDecimal(200));
            bank.transfer(3L, 2L, 100.00);
            System.out.println(bank);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }

        checkBalanceLogic();
        checkDepositLogic();
        checkWithdrawLogic();
        checkTransferLogic();
    }

    public void checkBalanceLogic() {
        checkButton.addActionListener(new CheckButtonInnerActionListener());
    }

    public void checkDepositLogic() {
        checkDeposit.addActionListener(new checkDepositInnerActionListener());
    }

    public void checkWithdrawLogic() {
        checkWithdraw.addActionListener(new checkWithdrawInnerActionListener());
    }

    public void checkTransferLogic() {
        checkTransfer.addActionListener(new checkTransferInnerActionListener());
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }


    public class CheckButtonInnerActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            try {
                Long accountId = Long.parseLong(accountIDTField.getText());
                Account account = bank.findAccountByNumber(accountId);
                balanceTField.setText(account.getBalance().toString());
                //balanceTField.setText("Balance of " + accountIDTField.getText());
            } catch(NumberFormatException ne) {
                JOptionPane.showMessageDialog(mainPanel, "Please provide a correct account number");
            } catch(AccountNotFoundException ae) {
                JOptionPane.showMessageDialog(mainPanel, "Account not found");
            }



        }
    }

    public class checkDepositInnerActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                Long accountId = Long.parseLong(idDeposit.getText());
                Account account = bank.findAccountByNumber(accountId);
                bank.deposit(accountId, new BigDecimal(amountDeposit.getText()));
                JOptionPane.showMessageDialog(mainPanel, "<html><h3>Successfully deposited!</h3></html> " +
                        "\nNow, Account " + accountId + " has EUR " + account.getBalance().toString());
            } catch (BankException e) {
                JOptionPane.showMessageDialog(mainPanel, e.getMessage());
    }
}
    }

    public class checkWithdrawInnerActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                Long accountId = Long.parseLong(idWithdraw.getText());
                Account account = bank.findAccountByNumber(accountId);
                bank.charge(accountId, new BigDecimal(amountWithdraw.getText()));
                JOptionPane.showMessageDialog(mainPanel, "<html><h3>Successfully withdrawn!</h3></html> " +
                        "\nNow, Account " + accountId + " has EUR " + account.getBalance().toString());
            } catch (BankException e) {
                JOptionPane.showMessageDialog(mainPanel, e.getMessage());
            }
        }
    }

    public class checkTransferInnerActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                Long accountIdFrom = Long.parseLong(idTransfer.getText());
                Long accountIdTo = Long.parseLong(idTransferTo.getText());
                Account accountFrom = bank.findAccountByNumber(accountIdFrom);
                Account accountTo = bank.findAccountByNumber(accountIdTo);
                bank.transfer(accountIdFrom, accountIdTo, new BigDecimal(amountTransfer.getText()));
                JOptionPane.showMessageDialog(mainPanel, "<html><h3>Successfully transferred!</h3></html> " +
                        "\nNow, Account " + accountIdFrom + " has EUR " + accountFrom.getBalance().toString() +
                        "\nAnd, Account " + accountIdTo + " has EUR " + accountTo.getBalance().toString());
            } catch (BankException e) {
                JOptionPane.showMessageDialog(mainPanel, e.getMessage());
            }
        }
    }
}
