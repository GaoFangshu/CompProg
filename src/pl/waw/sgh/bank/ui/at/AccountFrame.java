package pl.waw.sgh.bank.ui.at;

/**

 * Created by at64373 on 04.01.2017.
 */
import javax.swing.*;
import java.awt.*;

public class AccountFrame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Customer");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setBounds(300, 200, 600, 400);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Account number");
        panel.add(label);
        JTextField textField = new JTextField(10);
        panel.add(textField);

        JLabel label1 = new JLabel("Owner");
        panel.add(label1);
        JTextField textField1 = new JTextField(2);
        panel.add(textField1);

        JLabel label2 = new JLabel("Currency");
        panel.add(label2);
        JTextField textField2 = new JTextField(3);
        panel.add(textField2);

        JLabel label3 = new JLabel("Balance");
        panel.add(label3);
        JTextField textField3 = new JTextField(10);
        panel.add(textField3);


        frame.getContentPane().add(panel);
        panel.setBackground(Color.CYAN);
        frame.setVisible(true);
    }
}


