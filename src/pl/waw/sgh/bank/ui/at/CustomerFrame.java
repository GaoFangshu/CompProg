package pl.waw.sgh.bank.ui.at;

/**
 * Created by at64373 on 04.01.2017.
 */
import javax.swing.*;
import java.awt.*;
public class CustomerFrame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Customer");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setBounds(300, 200, 600, 400);

        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Surname");
        panel.add(label1);
        JTextField textField1 = new JTextField(25);
        panel.add(textField1);

        JLabel label2 = new JLabel("Name");
        panel.add(label2);
        JTextField textField2 = new JTextField(15);
        panel.add(textField2);

        frame.getContentPane().add(panel);
        panel.setBackground(Color.blue);

        frame.setVisible(true);

    }
}

