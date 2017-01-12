package pl.waw.sgh.bank.ui.bk;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
/**
 * Created by acer on 2017-01-01.
 */
public class Account_transfer_Frame
{
    public static void main(String[] args) {
        long fromAccNum = 1000200030004000L;
        JFrame frame = new JFrame("transfer[Account>>transfer]");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(255, 200);

        frame.setMinimumSize(new Dimension(100, 100));
        frame.setMaximumSize(new Dimension(500, 500));

        JPanel panel = new JPanel();
        JLabel lFromAccNum = new JLabel("From account number: " + fromAccNum);
        panel.add(lFromAccNum);
        JLabel lToAccNum = new JLabel("To account number: ");
        panel.add(lToAccNum);
        JTextField tfToAccNum = new JTextField(18);
        panel.add(tfToAccNum);
        JLabel lAmount = new JLabel("Amount: ");
        panel.add(lAmount);
        JTextField tfAmount = new JTextField(18);
        panel.add(tfAmount);
        JButton bDeposit = new JButton("Transfer");
        panel.add(bDeposit);
        JButton bCancel = new JButton("Cancel");
        panel.add(bCancel);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
