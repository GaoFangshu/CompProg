package pl.waw.sgh.bank.ui.bk;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

/**
 * Created by acer on 2017-01-01.
 */
public class Account_charge_Frame {
    public static void main(String[] args)
    {
        long accNum = 1000200030004000L;
        JFrame frame = new JFrame("charge[Account>>charge]");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(250, 150);

        frame.setMinimumSize(new Dimension(100, 100));
        frame.setMaximumSize(new Dimension(500, 500));

        JPanel panel = new JPanel();
        JLabel lAccNum = new JLabel("Account number: " + accNum);
        panel.add(lAccNum);
        JLabel lAmount = new JLabel("Amount: ");
        panel.add(lAmount);
        JTextField tfAmount = new JTextField(20);
        panel.add(tfAmount);
        JButton bDeposit = new JButton("Charge");
        panel.add(bDeposit);
        JButton bCancel = new JButton("Cancel");
        panel.add(bCancel);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
