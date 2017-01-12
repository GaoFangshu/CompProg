package pl.waw.sgh.bank.ui.bk;

import javax.swing.*;
import java.awt.*;
/**
 * Created by acer on 2017-01-01.
 */
public class Bank_newAccount_Frame
{
    public static void main(String[] args) {

        //long customerID = 10002000030004000L;
        JFrame frame = new JFrame("newAccount[Bank>>newAccount]");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(200, 150);

        //frame.setBounds(100, 100, 400, 500);

        frame.setMinimumSize(new Dimension(200, 100));
        frame.setMaximumSize(new Dimension(500, 500));

        JPanel panel = new JPanel();
        JLabel lCustomerID = new JLabel("CustomerID: ");
        panel.add(lCustomerID);
        JTextField tfCustomerID = new JTextField(17);
        panel.add(tfCustomerID);
        String[] accTypes = {"Checkings account", "Savings account"};
        JComboBox cbAccountType = new JComboBox(accTypes);
        panel.add(cbAccountType);
        JButton bOK = new JButton("OK");
        panel.add(bOK);
        JButton bCancel = new JButton("Cancel");
        panel.add(bCancel);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
