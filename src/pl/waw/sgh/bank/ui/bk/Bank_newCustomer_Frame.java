package pl.waw.sgh.bank.ui.bk;

import javax.swing.*;
import java.awt.*;
/**
 * Created by acer on 2017-01-01.
 */
public class Bank_newCustomer_Frame
{
    public static void main(String[] args) {

        long newCustomerID = 1000100010001000L;
        JFrame frame = new JFrame("newCustomer[Bank>>NewCustomer]");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(250, 180);

        //frame.setBounds(100, 100, 400, 500);

        frame.setMinimumSize(new Dimension(200, 200));
        frame.setMaximumSize(new Dimension(500, 500));

        JPanel panel = new JPanel();
        JLabel lNewCustomerID = new JLabel("New customer ID: " + newCustomerID);
        panel.add(lNewCustomerID);
        JLabel lFirstName = new JLabel("First Name: ");
        panel.add(lFirstName);
        JTextField tfFirstName = new JTextField(20);
        panel.add(tfFirstName);
        JLabel lLastName = new JLabel("Last Name: ");
        panel.add(lLastName);
        JTextField tfLastName = new JTextField(20);
        panel.add(tfLastName);
        frame.getContentPane().add(panel);
        JButton bOK = new JButton("OK");
        panel.add(bOK);
        JButton bCancel = new JButton("Cancel");
        panel.add(bCancel);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
