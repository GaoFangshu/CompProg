package pl.waw.sgh.bank.ui;

import pl.waw.sgh.bank.ui.dawid.BankForm;

import javax.swing.*;

/**
 * Created by prubac on 04.01.2017.
 */
public class BankUI {

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("Bank");
        BankForm bankForm = new BankForm();
        bankForm.init();
        mainFrame.setContentPane(bankForm.getMainPanel());
        mainFrame.pack();
        mainFrame.setVisible(true);

    }
}
