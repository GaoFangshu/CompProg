package pl.waw.sgh.bank.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by prubac on 14.12.2016.
 */
public class MyFirstFrame {


    public static void main(String[] args) {

        JFrame frame = new JFrame("My title");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setBounds(300, 200, 400, 500);

        frame.setMinimumSize(new Dimension(200, 200));
        frame.setMaximumSize(new Dimension(600, 600));

        LayoutManager layoutManager = new FlowLayout();

        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("My first label");
        panel.add(label1);
        JTextField textField = new JTextField(20);
        panel.add(textField);

        JLabel label2 = new JLabel("My second label");
        panel.add(label2);
        JTextField textField2 = new JTextField(20);
        panel.add(textField2);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
        //frame.setBackground(Color.BLUE);

    }
}
