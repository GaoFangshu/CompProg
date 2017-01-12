package pl.waw.sgh.bank.ui.bk;
import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

/**
 * Created by acer on 2017-01-01.
 */
public class Bank_deleteAccount_Frame
{
    public static void main(String[] args) {

        long customerID = 10002000030004000L;
        String accType = "Savings account";
        BigDecimal balance = new BigDecimal(0);
        JFrame frame = new JFrame("deleteAccount[?Bank>>deleteAccount]");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(210, 150);

        //frame.setBounds(100, 100, 400, 500);

        frame.setMinimumSize(new Dimension(200, 100));
        frame.setMaximumSize(new Dimension(500, 500));

        JPanel panel = new JPanel();
        JLabel lCustomerID = new JLabel("Customer ID: " + customerID);
        panel.add(lCustomerID);
        JLabel lAccType = new JLabel("Account type: " + accType);
        panel.add(lAccType);
        JLabel lBalance = new JLabel("Balance: " + balance);
        panel.add(lBalance);
        JButton bDelete = new JButton("Delete");
        panel.add(bDelete);
        JButton bCancel = new JButton("Cancel");
        panel.add(bCancel);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
