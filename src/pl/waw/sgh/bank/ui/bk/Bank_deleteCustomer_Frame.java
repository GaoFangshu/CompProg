package pl.waw.sgh.bank.ui.bk;

import javax.swing.*;
import java.awt.*;
/**
 * Created by acer on 2017-01-01.
 */
public class Bank_deleteCustomer_Frame
{
    public static void main(String[] args) {

        long customerID = 1000100010001000L;
        String firstName = "Stanisław";
        String lastName = "Wokulski";

        JFrame frame = new JFrame("deleteCustomer[?Bank>>deleteCustomer]");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(200, 130);

        //frame.setBounds(100, 100, 400, 500);

        frame.setMinimumSize(new Dimension(200, 130));
        frame.setMaximumSize(new Dimension(500, 500));

        JPanel panel = new JPanel();
        JLabel lCustomerID = new JLabel("Customer ID: " + customerID);
        panel.add(lCustomerID);
        JLabel lFirstName = new JLabel("First Name: " + firstName);
        panel.add(lFirstName);
        JLabel lLastName = new JLabel("Last Name: " + lastName);
        panel.add(lLastName);
        JButton bDelete = new JButton("Delete");
        panel.add(bDelete);
        JButton bCancel = new JButton("Cancel");
        panel.add(bCancel);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
